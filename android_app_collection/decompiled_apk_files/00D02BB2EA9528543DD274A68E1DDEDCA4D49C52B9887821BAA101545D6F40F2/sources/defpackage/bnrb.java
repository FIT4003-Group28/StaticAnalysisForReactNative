package defpackage;
/* compiled from: PG */
/* renamed from: bnrb  reason: default package */
/* loaded from: classes.dex */
public final class bnrb {
    public final String a = "precision highp float;uniform mat4 a,b,c;uniform vec3 d[2];uniform float e;attribute vec4 f;attribute vec4 g;attribute vec4 h;attribute vec4 i;varying vec4 j;varying vec2 k;void main(){vec3 l,n,o,q,r,s;l=f.xyz;vec2 m,p,t;m=vec2(f.w,g.x);n=g.yzw;o=h.xyz;p=vec2(h.w,i.x);q=i.yzw;r=mix(l,o,e);s=normalize(mix(n,q,e));t=mix(m,p,e);gl_Position=c*a*vec4(r,1);vec4 u=normalize(b*vec4(s,0));float v=.3125;v+=clamp(dot(d[0],u.xyz),0.,1.)*.75;v+=clamp(dot(d[1],u.xyz),0.,1.)*.75;j=vec4(vec3(v),1);k=vec2(t.x,1.-t.y);}";
    public final String b = "precision mediump float;uniform sampler2D l;varying vec4 j;varying vec2 k;void main(){vec4 m=texture2D(l,k);gl_FragColor=m*j;}";
    public final bnra c = new bnra();
    public final bnqz d = new bnqz();
}
