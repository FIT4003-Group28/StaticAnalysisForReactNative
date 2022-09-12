package defpackage;
/* compiled from: PG */
/* renamed from: bqgr  reason: default package */
/* loaded from: classes4.dex */
final class bqgr extends bqhe {
    private Integer a;
    private bqgw b;
    private int c;

    @Override // defpackage.bqhe
    public final void b(bqgw bqgwVar) {
        if (bqgwVar != null) {
            this.b = bqgwVar;
            return;
        }
        throw new NullPointerException("Null model");
    }

    @Override // defpackage.bqhe
    public final void c(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.bqhe
    public final void d(int i) {
        this.c = i;
    }

    @Override // defpackage.bqhe
    public final bqhf a() {
        String str = this.a == null ? " selectedPointIndex" : "";
        if (this.c == 0) {
            str = str.concat(" constructionMode");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" model");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bqgs(this.a.intValue(), this.c, this.b);
    }
}
