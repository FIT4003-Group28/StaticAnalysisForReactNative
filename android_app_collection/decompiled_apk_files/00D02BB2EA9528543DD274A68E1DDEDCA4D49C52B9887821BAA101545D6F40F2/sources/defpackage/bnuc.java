package defpackage;
/* compiled from: PG */
/* renamed from: bnuc  reason: default package */
/* loaded from: classes3.dex */
public final class bnuc {
    public final String a = "precision highp float;varying vec4 a;varying vec2 b;attribute vec3 c;attribute vec2 d;uniform vec2 e,f;void main(){gl_Position.x=c.x/e.x*2.-1.;gl_Position.y=c.y/e.y*-2.+1.;gl_Position.z=0.;gl_Position.w=1.;b=d*f;a=vec4(c.z);}";
    public final String b = "precision mediump float;varying vec4 a;varying vec2 b;uniform sampler2D g;void main(){gl_FragColor=a*texture2D(g,b);}";
    public final bnub c = new bnub();
    public final bnua d = new bnua();
}
