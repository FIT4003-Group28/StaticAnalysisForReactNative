package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: agfi  reason: default package */
/* loaded from: classes.dex */
public final class agfi implements yjo {
    agfj a;

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        agfj agfjVar = this.a;
        if (agfjVar == null) {
            return 1;
        }
        int i = agfjVar.h;
        if (i != 3 && i != 2) {
            return 0;
        }
        agfjVar.b();
        return 0;
    }
}
