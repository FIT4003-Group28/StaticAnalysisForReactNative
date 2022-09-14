package defpackage;
/* compiled from: PG */
/* renamed from: amnk  reason: default package */
/* loaded from: classes2.dex */
public final class amnk {
    public final String a = "precision highp float;varying vec2 a;varying highp float b;attribute vec4 c;attribute vec2 d;uniform mat4 e,f,g;uniform float h,i;uniform bool j;float m(float l){if(l<-h)l=l+i;if(l>h)l=l-i;return l;}void main(){a=d;b=c.z;if(j){gl_Position=f*vec4(c.xy,0,1);gl_Position.x=m(gl_Position.x);gl_Position=g*gl_Position;}else gl_Position=e*vec4(c.xy,0,1);}";
    public final String b = "precision highp float;const vec3 n=vec3(.54,0,.45);varying vec2 a;varying highp float b;uniform sampler2D k;uniform vec2 l;uniform float m;void main(){if(b==0.)discard;if(b!=clamp(b,l.x,l.y))discard;vec4 o,q;o=texture2D(k,a);float p=dot(o.rgb,n);q=vec4(vec3(p),o.a);gl_FragColor=mix(q,o,step(m,b));}";
    public final amnj c = new amnj();
    public final amni d = new amni();
}
