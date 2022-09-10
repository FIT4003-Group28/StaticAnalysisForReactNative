package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bdb  reason: default package */
/* loaded from: classes3.dex */
public final class bdb extends bl {
    @Override // defpackage.bl
    public final void a(avu avuVar) {
        avuVar.a();
        try {
            avuVar.h(WorkDatabase.s());
            avuVar.d();
        } finally {
            avuVar.c();
        }
    }
}
