package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vms  reason: default package */
/* loaded from: classes7.dex */
final class vms implements vmr {
    @Override // defpackage.vmr
    public final String a(dwao dwaoVar, Context context, vpd vpdVar) {
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        boolean z = dowrVar.b;
        boolean z2 = dowrVar.c;
        boolean z3 = dwaoVar.o;
        if (!z || !z2 || !z3) {
            if (z && z2) {
                return context.getString(R.string.DIRECTIONS_AVOIDING_HIGHWAYS_TOLLS);
            }
            if (z && z3) {
                return context.getString(R.string.DIRECTIONS_AVOIDING_HIGHWAYS_FERRIES);
            }
            if (z2 && z3) {
                return context.getString(R.string.DIRECTIONS_AVOIDING_TOLLS_FERRIES);
            }
            if (z) {
                return context.getString(R.string.DIRECTIONS_AVOIDING_HIGHWAYS);
            }
            if (z2) {
                return context.getString(R.string.DIRECTIONS_AVOIDING_TOLLS);
            }
            return !z3 ? "" : context.getString(R.string.DIRECTIONS_AVOIDING_FERRIES);
        }
        return context.getString(R.string.DIRECTIONS_AVOIDING_HIGHWAYS_TOLLS_FERRIES);
    }
}
