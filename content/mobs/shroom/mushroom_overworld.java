// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class mushroom_overworld extends EntityModel<Entity> {
	private final ModelPart bb_main;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	public mushroom_overworld(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -5.0F, -3.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 10).cuboid(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 10).cuboid(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 10).cuboid(3.0F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 10).cuboid(-4.0F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(16, 9).cuboid(-4.0F, -3.5F, 0.0F, 8.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData cube_r2 = bb_main.addChild("cube_r2", ModelPartBuilder.create().uv(16, 9).cuboid(-4.0F, -3.5F, 0.0F, 8.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.5F, 0.0F, -3.1416F, 0.7854F, 3.1416F));
		return TexturedModelData.of(modelData, 32, 16);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}