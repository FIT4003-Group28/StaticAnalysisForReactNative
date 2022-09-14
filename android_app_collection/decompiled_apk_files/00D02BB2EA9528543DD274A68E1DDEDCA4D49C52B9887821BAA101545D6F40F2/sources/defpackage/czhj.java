package defpackage;

import gen_binder.root.RootModule$Generated;
/* compiled from: PG */
/* renamed from: czhj  reason: default package */
/* loaded from: classes.dex */
public final class czhj {
    public static final void a(czhd czhdVar) {
        try {
            czhdVar.e();
            czhdVar.f.add((RootModule$Generated) Class.forName("gen_binder.root.RootModule$Generated").newInstance());
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", e2);
        }
        synchronized (czhdVar) {
            if (!(czhdVar.g instanceof czhk)) {
                return;
            }
            czhdVar.g = new czhi();
        }
    }
}
