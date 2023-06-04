// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class ash_skeleton extends EntityModel<Entity> {
	private final ModelPart ash_man;
	private final ModelPart lower;
	private final ModelPart upper;
	private final ModelPart head;
	private final ModelPart arms;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart legs;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	public ash_skeleton(ModelPart root) {
		this.ash_man = root.getChild("ash_man");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData ash_man = modelPartData.addChild("ash_man", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData lower = ash_man.addChild("lower", ModelPartBuilder.create().uv(19, 50).cuboid(-5.0F, -2.0F, -4.0F, 10.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -38.0F, 0.0F));

		ModelPartData upper = lower.addChild("upper", ModelPartBuilder.create().uv(16, 18).cuboid(-8.0F, -18.0F, -8.0F, 16.0F, 18.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 2.0F));

		ModelPartData head = upper.addChild("head", ModelPartBuilder.create().uv(24, 0).cuboid(-4.0F, -10.0F, -8.0F, 8.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -18.0F, 0.0F));

		ModelPartData arms = upper.addChild("arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -15.0F, -2.0F));

		ModelPartData right_arm = arms.addChild("right_arm", ModelPartBuilder.create().uv(64, 18).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 38.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));

		ModelPartData left_arm = arms.addChild("left_arm", ModelPartBuilder.create().uv(72, 18).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 38.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(9.0F, 0.0F, 0.0F));

		ModelPartData legs = lower.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_leg = legs.addChild("left_leg", ModelPartBuilder.create().uv(8, 18).cuboid(0.0F, 0.0F, -2.0F, 2.0F, 38.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 0.0F, 0.0F));

		ModelPartData right_leg = legs.addChild("right_leg", ModelPartBuilder.create().uv(0, 18).cuboid(-2.0F, 0.0F, -2.0F, 2.0F, 38.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		ash_man.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}