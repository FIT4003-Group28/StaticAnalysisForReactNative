package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: vmq  reason: default package */
/* loaded from: classes7.dex */
final class vmq implements vmr {
    @Override // defpackage.vmr
    public final String a(dwao dwaoVar, Context context, vpd vpdVar) {
        vpc vpcVar;
        dowl dowlVar;
        CharSequence i;
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        boolean z = dowrVar.b;
        boolean z2 = dowrVar.c;
        boolean z3 = dwaoVar.o;
        dowl dowlVar2 = dowl.UNSET;
        Iterator<dowm> it = dowrVar.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                vpcVar = null;
                dowlVar = dowlVar2;
                break;
            }
            dowl b = dowl.b(it.next().b);
            if (b == null) {
                b = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
            }
            vpcVar = vph.b(b);
            if (!vph.a(b) && vpcVar != null && vpdVar.c(vpcVar)) {
                dowlVar = b;
                break;
            }
        }
        if (dowlVar == dowl.UNSET || vpcVar == null) {
            return "";
        }
        if (z && z2 && z3) {
            i = vph.i(context.getResources(), dowlVar, R.string.DIRECTIONS_AVOIDING_EVEN_ROADS_HIGHWAYS_TOLLS_FERRIES, R.string.DIRECTIONS_AVOIDING_ODD_ROADS_HIGHWAYS_TOLLS_FERRIES, R.string.DIRECTIONS_AVOIDING_RODIZIO_AREAS_HIGHWAYS_TOLLS_FERRIES, R.string.DIRECTIONS_AVOIDING_MANILA_NUMBER_CODE_AREAS_HIGHWAYS_TOLLS_FERRIES);
        } else if (z && z2) {
            i = vph.i(context.getResources(), dowlVar, R.string.DIRECTIONS_AVOIDING_EVEN_ROADS_HIGHWAYS_TOLLS, R.string.DIRECTIONS_AVOIDING_ODD_ROADS_HIGHWAYS_TOLLS, R.string.DIRECTIONS_AVOIDING_RODIZIO_AREAS_HIGHWAYS_TOLLS, R.string.DIRECTIONS_AVOIDING_MANILA_NUMBER_CODE_AREAS_HIGHWAYS_TOLLS);
        } else if (z && z3) {
            i = vph.i(context.getResources(), dowlVar, R.string.DIRECTIONS_AVOIDING_EVEN_ROADS_HIGHWAYS_FERRIES, R.string.DIRECTIONS_AVOIDING_ODD_ROADS_HIGHWAYS_FERRIES, R.string.DIRECTIONS_AVOIDING_RODIZIO_AREAS_HIGHWAYS_FERRIES, R.string.DIRECTIONS_AVOIDING_MANILA_NUMBER_CODE_AREAS_HIGHWAYS_FERRIES);
        } else if (z2 && z3) {
            i = vph.i(context.getResources(), dowlVar, R.string.DIRECTIONS_AVOIDING_EVEN_ROADS_TOLLS_FERRIES, R.string.DIRECTIONS_AVOIDING_ODD_ROADS_TOLLS_FERRIES, R.string.DIRECTIONS_AVOIDING_RODIZIO_AREAS_TOLLS_FERRIES, R.string.DIRECTIONS_AVOIDING_MANILA_NUMBER_CODE_AREAS_TOLLS_FERRIES);
        } else if (z) {
            i = vph.i(context.getResources(), dowlVar, R.string.DIRECTIONS_AVOIDING_EVEN_ROADS_HIGHWAYS, R.string.DIRECTIONS_AVOIDING_ODD_ROADS_HIGHWAYS, R.string.DIRECTIONS_AVOIDING_RODIZIO_AREAS_HIGHWAYS, R.string.DIRECTIONS_AVOIDING_MANILA_NUMBER_CODE_AREAS_HIGHWAYS);
        } else if (z2) {
            i = vph.i(context.getResources(), dowlVar, R.string.DIRECTIONS_AVOIDING_EVEN_ROADS_TOLLS, R.string.DIRECTIONS_AVOIDING_ODD_ROADS_TOLLS, R.string.DIRECTIONS_AVOIDING_RODIZIO_AREAS_TOLLS, R.string.DIRECTIONS_AVOIDING_MANILA_NUMBER_CODE_AREAS_TOLLS);
        } else if (z3) {
            i = vph.i(context.getResources(), dowlVar, R.string.DIRECTIONS_AVOIDING_EVEN_ROADS_FERRIES, R.string.DIRECTIONS_AVOIDING_ODD_ROADS_FERRIES, R.string.DIRECTIONS_AVOIDING_RODIZIO_AREAS_FERRIES, R.string.DIRECTIONS_AVOIDING_MANILA_NUMBER_CODE_AREAS_FERRIES);
        } else {
            i = vph.i(context.getResources(), dowlVar, R.string.DIRECTIONS_AVOIDING_EVEN_ROADS, R.string.DIRECTIONS_AVOIDING_ODD_ROADS, R.string.DIRECTIONS_AVOIDING_RODIZIO_AREAS, R.string.DIRECTIONS_AVOIDING_MANILA_NUMBER_CODE_AREAS);
        }
        return i == null ? "" : i.toString();
    }
}
