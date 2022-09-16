package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: qug  reason: default package */
/* loaded from: classes7.dex */
public final class qug {
    public static final qui a(domy domyVar, domy domyVar2) {
        qui quiVar = new qui();
        Bundle bundle = new Bundle();
        bundle.putInt("immersive_travel_mode", domyVar.h);
        bundle.putInt("user_travel_mode", domyVar2.h);
        quiVar.B(bundle);
        return quiVar;
    }
}
