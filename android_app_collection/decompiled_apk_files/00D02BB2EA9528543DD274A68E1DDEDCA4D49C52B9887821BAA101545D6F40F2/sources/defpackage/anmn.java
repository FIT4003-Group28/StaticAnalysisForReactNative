package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anmn  reason: default package */
/* loaded from: classes2.dex */
public final class anmn {
    public final List<Runnable> a = new ArrayList();
    final /* synthetic */ anmp b;

    public anmn(anmp anmpVar) {
        this.b = anmpVar;
    }

    public final void a() {
        for (Runnable runnable : this.a) {
            runnable.run();
        }
    }
}
