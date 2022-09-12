package defpackage;
/* compiled from: PG */
/* renamed from: ampz  reason: default package */
/* loaded from: classes2.dex */
public final class ampz {
    public final String a = "precision highp float;varying vec4 a;uniform mat4 b;uniform ivec2 c[64*3];uniform float d;attribute vec4 e;attribute vec4 f;vec4 j(ivec2 g){vec4 h;h.r=fract(float(g.x)*(1./256.))*(256./255.);h.a=floor(float(g.x)*(1./256.))*(1./255.);h.b=fract(float(g.y)*(1./256.))*(256./255.);h.g=floor(float(g.y)*(1./256.))*(1./255.);return h;}void main(){ivec2 g=c[int(f.r)*3+int(f.g)];float h,i;h=f.b/4.;i=f.a/4.;if(g.x>65535||d<h||d>i){gl_Position=vec4(0);return;}gl_Position=b*e;a=j(g);}";
    public final String b = "precision mediump float;varying vec4 a;void main(){gl_FragColor=a;}";
    public final ampy c = new ampy();
    public final ampx d = new ampx();
}
