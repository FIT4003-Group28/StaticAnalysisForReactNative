package defpackage;
/* compiled from: PG */
/* renamed from: bnrx  reason: default package */
/* loaded from: classes3.dex */
public final class bnrx extends bnuu {
    private static final String[] a = {"aPosition", "unused", "aColor"};

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bnuu
    public final void a(bntb bntbVar, int i) {
        this.x = bntbVar.i(i, "uMVPMatrix");
    }

    @Override // defpackage.bnuu
    public final String[] b() {
        return a;
    }

    @Override // defpackage.bnuu
    public final String c() {
        return "precision highp float;\nuniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nattribute vec4 aColor;\nvarying vec4 color;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  color = aColor;\n}\n";
    }

    @Override // defpackage.bnuu
    public final String d() {
        return "precision mediump float;\nvarying vec4 color;\nvoid main() {\n  gl_FragColor = color;\n}\n";
    }
}
