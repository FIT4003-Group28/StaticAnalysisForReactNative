package defpackage;
/* compiled from: PG */
/* renamed from: amng  reason: default package */
/* loaded from: classes.dex */
public final class amng {
    public final String a;
    public final String b;
    public final amnf c;
    public final amne d;

    public amng() {
        double d = amnh.c;
        int i = amnh.d;
        StringBuilder sb = new StringBuilder(209);
        sb.append("#define _a 1.5259021896696422E-5\n#define _b 8\n#define _c ");
        sb.append(d);
        sb.append("\n#define _d ");
        sb.append(8);
        sb.append("\n#define _e ");
        sb.append(14);
        sb.append("\n#define _f ");
        sb.append(64);
        sb.append("\n#define _g ");
        sb.append(i);
        sb.append("\n#define _h ");
        sb.append(32);
        sb.append("\n#define _i ");
        sb.append(64);
        sb.append("\n#define _j ");
        sb.append(4);
        sb.append("\n#define _k ");
        sb.append(2);
        sb.append("\n");
        String sb2 = sb.toString();
        this.a = String.valueOf(sb2).concat("precision highp float;varying float a,d,f;varying highp vec2 b;varying vec4 c;varying highp float e;attribute vec4 g;attribute vec4 h;attribute vec4 i;uniform mat4 j,k,l;uniform vec2 m[_d];uniform float n,o,p,q;uniform bool r;uniform ivec2 s[_e];float D(float u,float v){float w=(u*256.+v)*_a;return 2.*_c*q*(w-.5);}void E(in vec4 u,out vec2 v){v.x=D(u.x,u.y);v.y=D(u.z,u.w);}float F(float u){if(u<-o)u=u+p;if(u>o)u=u-p;return u;}void main(){vec2 u,x;E(i,u);int v,w;v=int(h.x+.5);w=int(h.w+.5);a=float(v);x=g.xy;d=m[v].x;float A,B;A=(d/2.+1.)*n;B=(d+2.)/d;if(r){gl_Position=j*vec4(x,0,1);gl_Position.x=F(gl_Position.x);vec4 C=j*vec4(A*u,0,0);gl_Position=gl_Position+C;gl_Position=k*gl_Position;}else gl_Position=l*vec4(x+A*u,0,1);e=g.z;if(e<=-1.5){e=-(e+2.);e+=n*d/2.;}else if(e<0.)e+=-n*d/2.;e+=d/2.;b.y=e/n;c.zw=vec2(1,0);if(w>_b-1){c.zw=vec2(0,1);w=w-_b;}c.xy=vec2(s[w])*.5;c=(c-.5)*B+.5;b.x=c.x;f=h.z/255.;}");
        this.b = String.valueOf(sb2).concat("precision highp float;const vec3 I=vec3(.54,0,.45);varying float a,d,f;varying highp vec2 b;varying vec4 c;varying highp float e;uniform sampler2D t,u,v,w,x;uniform float A,B,E,F,G;uniform highp float C;uniform int D;uniform vec2 H;void main(){if(c.y>1.)discard;if(e!=clamp(e,H.x,H.y))discard;vec2 J,Q,S,Z;J=b;J.y*=C/d;vec4 K,L,M,R,T,U,W,X;K=texture2D(v,J);L=texture2D(t,c.xy,-.5);M=texture2D(u,c.xy,-.5);float N,O,P,V,Y,aa,ba;N=c.z*L.a+c.w*M.a;O=A+.5;P=a*float(_j)*float(_k)+float(D)*float(_k)+.5;Q=vec2(O/float(_g),P/float(_f));R=texture2D(w,Q);S=vec2(O/float(_g),(P+1.)/float(_f));T=texture2D(w,S);U=R*(1.-f)+T*f;V=dot(U.rgb,I);W=vec4(vec3(V),U.a);X=mix(W,U,step(G,e));Y=mod(b.y*8.,E)/F;Z=vec2(Y/float(_i),(a*float(_j)+float(D)+.5)/float(_h));aa=texture2D(x,Z).r;aa=clamp((aa-.5)*F+.5,0.,1.);ba=clamp((1.+d)/2.-d*abs(J.x-.5),0.,1.);gl_FragColor=vec4(X.rgb,1)*vec4(K.rgb/K.a,1)*X.a*K.a*B*N*aa*ba;}");
        this.c = new amnf();
        this.d = new amne();
    }
}
