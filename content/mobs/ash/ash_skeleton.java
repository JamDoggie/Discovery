// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class ash_skeleton<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ash_skeleton"), "main");
	private final ModelPart ash_man;

	public ash_skeleton(ModelPart root) {
		this.ash_man = root.getChild("ash_man");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition ash_man = partdefinition.addOrReplaceChild("ash_man", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lower = ash_man.addOrReplaceChild("lower", CubeListBuilder.create().texOffs(19, 50).addBox(-5.0F, 0.0F, -4.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 38.0F, 0.0F));

		PartDefinition upper = lower.addOrReplaceChild("upper", CubeListBuilder.create().texOffs(16, 18).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 2.0F));

		PartDefinition head = upper.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, 0.0F, -8.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition arms = upper.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, -2.0F));

		PartDefinition right_arm = arms.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(64, 18).addBox(-1.0F, -37.0F, -1.0F, 2.0F, 38.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, 0.0F, 0.0F));

		PartDefinition left_arm = arms.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(72, 18).addBox(-1.0F, -37.0F, -1.0F, 2.0F, 38.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 0.0F, 0.0F));

		PartDefinition legs = lower.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = legs.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(8, 18).addBox(0.0F, -38.0F, -2.0F, 2.0F, 38.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition right_leg = legs.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -38.0F, -2.0F, 2.0F, 38.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		ash_man.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}