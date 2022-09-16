package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: amze  reason: default package */
/* loaded from: classes.dex */
public final class amze extends amzg implements amwg {
    private static final long serialVersionUID = 0;

    public amze(amwg amwgVar) {
        super(amwgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.amzg
    /* renamed from: a */
    public final amwg b() {
        return (amwg) super.b();
    }

    @Override // defpackage.amwg
    public final List e(Object obj) {
        throw null;
    }

    @Override // defpackage.amwg
    public final List f(Object obj) {
        List f;
        synchronized (this.g) {
            f = b().f(obj);
        }
        return f;
    }
}
