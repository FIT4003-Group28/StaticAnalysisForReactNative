package defpackage;
/* compiled from: PG */
/* renamed from: bnuj  reason: default package */
/* loaded from: classes.dex */
public final class bnuj {
    public final String a = "precision highp float;varying vec4 a;varying vec2 b;uniform mat4 c,d,e;uniform vec3 f;attribute vec3 g;attribute vec2 h;attribute vec3 i;void main(){gl_Position=e*c*vec4(g,1);vec4 j=normalize(d*vec4(i,0));float k=clamp(abs(dot(f,j.xyz)),0.,1.)*.3+.7;a=vec4(k,k,k,1);b=vec2(h.x,1.-h.y);}";
    public final String b = "precision mediump float;varying vec4 a;varying vec2 b;uniform sampler2D j;void main(){vec4 k=texture2D(j,b);gl_FragColor=k*a;}";
    public final bnui c = new bnui();
    public final bnuh d = new bnuh();
}
