package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asp  reason: default package */
/* loaded from: classes2.dex */
public final class asp extends Handler {
    public final WeakReference<asm> a;

    public asp(asm asmVar) {
        this.a = new WeakReference<>(asmVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        aqt aqtVar;
        asm asmVar = this.a.get();
        if (asmVar != null) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle peekData = message.peekData();
            String str = null;
            if (i == 0) {
                if (i2 == asmVar.f) {
                    asmVar.f = 0;
                    ast astVar = asmVar.h;
                    if (astVar.m == asmVar) {
                        astVar.l();
                    }
                }
                arf arfVar = asmVar.g.get(i2);
                if (arfVar == null) {
                    return;
                }
                asmVar.g.remove(i2);
                arfVar.b(null, null);
                return;
            }
            switch (i) {
                case 2:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (asmVar.e != 0 || i2 != asmVar.f || i3 <= 0) {
                        return;
                    }
                    asmVar.f = 0;
                    asmVar.e = i3;
                    asmVar.h.m(asmVar, ara.b(bundle));
                    ast astVar2 = asmVar.h;
                    if (astVar2.m != asmVar) {
                        return;
                    }
                    astVar2.n = true;
                    int size = astVar2.c.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        astVar2.c.get(i4).e(astVar2.m);
                    }
                    aqo aqoVar = astVar2.i;
                    if (aqoVar == null) {
                        return;
                    }
                    astVar2.m.f(aqoVar);
                    return;
                case 3:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle2 = (Bundle) obj;
                    arf arfVar2 = asmVar.g.get(i2);
                    if (arfVar2 == null) {
                        return;
                    }
                    asmVar.g.remove(i2);
                    arfVar2.a(bundle2);
                    return;
                case 4:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    if (peekData != null) {
                        str = peekData.getString("error");
                    }
                    Bundle bundle3 = (Bundle) obj;
                    arf arfVar3 = asmVar.g.get(i2);
                    if (arfVar3 == null) {
                        return;
                    }
                    asmVar.g.remove(i2);
                    arfVar3.b(str, bundle3);
                    return;
                case 5:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle4 = (Bundle) obj;
                    if (asmVar.e == 0) {
                        return;
                    }
                    asmVar.h.m(asmVar, ara.b(bundle4));
                    return;
                case 6:
                    if (!(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle5 = (Bundle) obj;
                    arf arfVar4 = asmVar.g.get(i2);
                    if (bundle5 == null || !bundle5.containsKey("routeId")) {
                        arfVar4.b("DynamicGroupRouteController is created without valid route id.", bundle5);
                        return;
                    }
                    asmVar.g.remove(i2);
                    arfVar4.a(bundle5);
                    return;
                case 7:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle6 = (Bundle) obj;
                    if (asmVar.e == 0) {
                        return;
                    }
                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                    aqn u = bundle7 != null ? aqn.u(bundle7) : null;
                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                    ArrayList arrayList = new ArrayList();
                    int size2 = parcelableArrayList.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        Bundle bundle8 = (Bundle) parcelableArrayList.get(i5);
                        if (bundle8 == null) {
                            aqtVar = null;
                        } else {
                            aqn u2 = aqn.u(bundle8.getBundle("mrDescriptor"));
                            int i6 = bundle8.getInt("selectionState", 1);
                            bundle8.getBoolean("isUnselectable", false);
                            bundle8.getBoolean("isGroupable", false);
                            bundle8.getBoolean("isTransferable", false);
                            aqtVar = new aqt(u2, i6);
                        }
                        arrayList.add(aqtVar);
                    }
                    ast astVar3 = asmVar.h;
                    if (astVar3.m != asmVar) {
                        return;
                    }
                    asn n = astVar3.n(i3);
                    if (!(n instanceof asr)) {
                        return;
                    }
                    ((asr) n).k(u, arrayList);
                    return;
                case 8:
                    ast astVar4 = asmVar.h;
                    if (astVar4.m != asmVar) {
                        return;
                    }
                    asn n2 = astVar4.n(i3);
                    asu asuVar = astVar4.o;
                    if (asuVar != null && (n2 instanceof aqx)) {
                        aqx aqxVar = (aqx) n2;
                        arm armVar = (arm) asuVar.a.b;
                        if (armVar.m == aqxVar) {
                            armVar.c(armVar.k(), 2);
                        }
                    }
                    astVar4.p(n2);
                    return;
                default:
                    return;
            }
        }
    }
}
