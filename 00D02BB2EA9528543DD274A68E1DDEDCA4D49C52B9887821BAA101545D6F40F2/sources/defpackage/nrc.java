package defpackage;

import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nrc  reason: default package */
/* loaded from: classes7.dex */
public abstract class nrc {
    public static nrb k(cqvj cqvjVar) {
        nqa nqaVar = new nqa();
        if (cqvjVar != null) {
            nqaVar.a = cqvjVar;
            return nqaVar;
        }
        throw new NullPointerException("Null typeface");
    }

    public abstract cqvj a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract cqtv b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract cqtv c();

    public abstract float d();

    public abstract dbsg<cqss> e();

    public abstract dbsg<cqjb<? extends cqkp, cqss>> f();

    public abstract dbsg<cqlc<? extends cqkp, cqss>> g();

    public abstract dbsg<? extends cqtv> h();

    public abstract dbsg<? extends cqtv> i();

    public abstract TextUtils.TruncateAt j();
}
