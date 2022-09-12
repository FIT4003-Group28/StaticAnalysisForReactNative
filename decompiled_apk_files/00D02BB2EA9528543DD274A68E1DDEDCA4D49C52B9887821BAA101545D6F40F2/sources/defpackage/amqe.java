package defpackage;
/* compiled from: PG */
/* renamed from: amqe  reason: default package */
/* loaded from: classes2.dex */
public final class amqe {
    public final String a = "precision highp float;varying vec2 a;varying vec4 b;uniform mat4 c;uniform mat3 d;uniform ivec2 e[4];uniform float f;attribute vec4 g;attribute vec2 h;attribute float i;vec4 m(ivec2 j){vec4 k;float l=float(j.x);k.r=mod(l,256.);l-=k.r;k.a=l/256.;l=float(j.y);k.b=mod(l,256.);l-=k.b;k.g=l/256.;return k/255.;}void main(){ivec2 j=e[int(i)];bool k=j.x>65535;if(k){gl_Position=vec4(0);return;}gl_Position=c*g;a=(d*vec3(h,1)).xy;b=m(j);b*=f;}";
    public final String b = "precision mediump float;varying vec2 a;varying vec4 b;uniform sampler2D j;void main(){gl_FragColor=b*texture2D(j,a);}";
    public final amqd c = new amqd();
    public final amqc d = new amqc();
}
