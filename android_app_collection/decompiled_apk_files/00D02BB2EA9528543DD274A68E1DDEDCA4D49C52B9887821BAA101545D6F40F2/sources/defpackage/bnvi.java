package defpackage;
/* compiled from: PG */
/* renamed from: bnvi  reason: default package */
/* loaded from: classes.dex */
public final class bnvi {
    public final String a = "precision highp float;varying vec4 a;varying vec2 b;uniform mat4 c;uniform mat3 d;attribute vec4 e;attribute vec4 f;attribute vec2 g;void main(){gl_Position=c*e;b=(d*vec3(g,1)).xy;a=f;}";
    public final String b = "precision mediump float;varying vec4 a;varying vec2 b;uniform sampler2D h;uniform float i;void main(){gl_FragColor=a*texture2D(h,b,i);}";
    public final bnvh c = new bnvh();
    public final bnvg d = new bnvg();
}
