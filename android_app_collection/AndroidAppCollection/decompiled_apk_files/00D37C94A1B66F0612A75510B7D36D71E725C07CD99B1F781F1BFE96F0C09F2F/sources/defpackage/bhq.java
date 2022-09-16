package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhq  reason: default package */
/* loaded from: classes2.dex */
public final class bhq extends Handler {
    public final WeakReference a;

    public bhq(bho bhoVar) {
        this.a = new WeakReference(bhoVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        bgf bgfVar;
        bho bhoVar = (bho) this.a.get();
        if (bhoVar != null) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle peekData = message.peekData();
            String str = null;
            if (i == 0) {
                if (i2 == bhoVar.f) {
                    bhoVar.f = 0;
                    bhu bhuVar = bhoVar.h;
                    if (bhuVar.d == bhoVar) {
                        bhuVar.o();
                    }
                }
                ku kuVar = (ku) bhoVar.g.get(i2);
                if (kuVar == null) {
                    return;
                }
                bhoVar.g.remove(i2);
                kuVar.i(null, null);
                return;
            }
            switch (i) {
                case 2:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (bhoVar.e != 0 || i2 != bhoVar.f || i3 <= 0) {
                        return;
                    }
                    bhoVar.f = 0;
                    bhoVar.e = i3;
                    bhoVar.h.l(bhoVar, bgm.a(bundle));
                    bhu bhuVar2 = bhoVar.h;
                    if (bhuVar2.d != bhoVar) {
                        return;
                    }
                    bhuVar2.m = true;
                    int size = bhuVar2.b.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((bhp) bhuVar2.b.get(i4)).e(bhuVar2.d);
                    }
                    bgb bgbVar = bhuVar2.i;
                    if (bgbVar == null) {
                        return;
                    }
                    bhuVar2.d.c(bgbVar);
                    return;
                case 3:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle2 = (Bundle) obj;
                    ku kuVar2 = (ku) bhoVar.g.get(i2);
                    if (kuVar2 == null) {
                        return;
                    }
                    bhoVar.g.remove(i2);
                    kuVar2.j(bundle2);
                    return;
                case 4:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    if (peekData != null) {
                        str = peekData.getString("error");
                    }
                    Bundle bundle3 = (Bundle) obj;
                    ku kuVar3 = (ku) bhoVar.g.get(i2);
                    if (kuVar3 == null) {
                        return;
                    }
                    bhoVar.g.remove(i2);
                    kuVar3.i(str, bundle3);
                    return;
                case 5:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle4 = (Bundle) obj;
                    if (bhoVar.e == 0) {
                        return;
                    }
                    bhoVar.h.l(bhoVar, bgm.a(bundle4));
                    return;
                case 6:
                    if (obj instanceof Bundle) {
                        Bundle bundle5 = (Bundle) obj;
                        ku kuVar4 = (ku) bhoVar.g.get(i2);
                        if (bundle5 == null || !bundle5.containsKey("routeId")) {
                            kuVar4.i("DynamicGroupRouteController is created without valid route id.", bundle5);
                            return;
                        }
                        bhoVar.g.remove(i2);
                        kuVar4.j(bundle5);
                        return;
                    }
                    Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                    return;
                case 7:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return;
                    }
                    Bundle bundle6 = (Bundle) obj;
                    if (bhoVar.e == 0) {
                        return;
                    }
                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                    bga l = bundle7 != null ? bga.l(bundle7) : null;
                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                    ArrayList arrayList = new ArrayList();
                    int size2 = parcelableArrayList.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        Bundle bundle8 = (Bundle) parcelableArrayList.get(i5);
                        if (bundle8 == null) {
                            bgfVar = null;
                        } else {
                            bga l2 = bga.l(bundle8.getBundle("mrDescriptor"));
                            int i6 = bundle8.getInt("selectionState", 1);
                            bundle8.getBoolean("isUnselectable", false);
                            bundle8.getBoolean("isGroupable", false);
                            bundle8.getBoolean("isTransferable", false);
                            bgfVar = new bgf(l2, i6);
                        }
                        arrayList.add(bgfVar);
                    }
                    bhu bhuVar3 = bhoVar.h;
                    if (bhuVar3.d != bhoVar) {
                        return;
                    }
                    bhp e = bhuVar3.e(i3);
                    if (!(e instanceof bhs)) {
                        return;
                    }
                    ((bhs) e).k(l, arrayList);
                    return;
                case 8:
                    bhu bhuVar4 = bhoVar.h;
                    if (bhuVar4.d != bhoVar) {
                        return;
                    }
                    bhp e2 = bhuVar4.e(i3);
                    bhv bhvVar = bhuVar4.n;
                    if (bhvVar != null && (e2 instanceof bgj)) {
                        bgj bgjVar = (bgj) e2;
                        bgw bgwVar = (bgw) bhvVar.a.b;
                        if (bgwVar.t == bgjVar) {
                            bgwVar.j(bgwVar.c(), 2);
                        }
                    }
                    bhuVar4.m(e2);
                    return;
                default:
                    return;
            }
        }
    }
}
