package defpackage;
/* compiled from: PG */
/* renamed from: bnrn  reason: default package */
/* loaded from: classes.dex */
public final class bnrn {
    public final String a = "precision highp float;varying vec4 a;uniform mat4 b;uniform vec4 c;uniform float d,f,g,h;uniform ivec4 e[16];attribute vec4 i;attribute vec4 j;attribute float k;vec4 s(ivec2 l){vec4 m;float n=float(l.x);m.r=mod(n,256.);n-=m.r;m.a=n/256.;n=float(l.y);m.b=mod(n,256.);n-=m.b;m.g=n/256.;return m/255.;}void main(){ivec4 l=e[int(j.r)];float m,n;m=j.b/4.;n=j.a/4.;bool o=l.x>65535||f<m||f>n;if(o){gl_Position=vec4(0);return;}vec3 p=i.xyz;p=p*c.w+c.xyz;gl_Position=b*vec4(p.xy,p.z*d,1);gl_Position.z+=h;vec4 q=s(j.g==0.?l.xy:l.zw);a=q*vec2(k,g).xxxy;a.r=min(a.r,1.);a.g=min(a.g,1.);a.b=min(a.b,1.);}";
    public final String b = "precision highp float;varying vec4 a;void main(){gl_FragColor=a;}";
    public final bnrm c = new bnrm();
    public final bnrl d = new bnrl();
}
