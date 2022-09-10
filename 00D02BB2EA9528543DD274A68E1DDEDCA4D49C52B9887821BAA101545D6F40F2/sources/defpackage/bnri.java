package defpackage;
/* compiled from: PG */
/* renamed from: bnri  reason: default package */
/* loaded from: classes.dex */
public final class bnri {
    private static final String[] l = {"pos"};
    public final bntb a;
    public final int b;
    public final bntc c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    private final bntc m;

    public bnri(bntb bntbVar) {
        this.a = bntbVar;
        int k = bntbVar.k("precision highp float;attribute vec2 pos;uniform vec2 blitSourceSize;uniform float blitSourceScale;uniform vec2 blitTargetSize;uniform vec2 blitTargetPos;uniform float blitFlipY;varying vec2 texCoord;void main(void) {  vec2 pixelPos = (pos * blitSourceSize * blitSourceScale) + blitTargetPos;  vec2 devicePos = 2.0 * (pixelPos / blitTargetSize) - 1.0;  devicePos.y *= blitFlipY;  gl_Position = vec4(devicePos, 0.0, 1.0);  texCoord = pos;}", "precision highp float;varying vec2 texCoord;uniform sampler2D blitTextureUnit;uniform float blitAlphaScale;uniform float blitAlphaBias;void main(void) {  gl_FragColor = texture2D(blitTextureUnit, texCoord);  gl_FragColor.a = gl_FragColor.a * blitAlphaScale + blitAlphaBias;}", l);
        this.b = k;
        bntbVar.h(k);
        this.d = bntbVar.i(k, "blitSourceSize");
        this.e = bntbVar.i(k, "blitSourceScale");
        this.f = bntbVar.i(k, "blitTargetSize");
        this.g = bntbVar.i(k, "blitTargetPos");
        this.h = bntbVar.i(k, "blitFlipY");
        this.i = bntbVar.i(k, "blitTextureUnit");
        this.j = bntbVar.i(k, "blitAlphaScale");
        this.k = bntbVar.i(k, "blitAlphaBias");
        bntc s = bntbVar.s("blitter_square");
        this.c = s;
        bntbVar.v(s);
        bntbVar.O(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f});
        bntc f = bntbVar.f("checker");
        this.m = f;
        bntbVar.U(f, 4, 4, new int[]{-1, -16777216, -1, -16777216, -16777216, -1, -16777216, -1, -1, -16777216, -1, -16777216, -16777216, -1, -16777216, -1});
    }
}
