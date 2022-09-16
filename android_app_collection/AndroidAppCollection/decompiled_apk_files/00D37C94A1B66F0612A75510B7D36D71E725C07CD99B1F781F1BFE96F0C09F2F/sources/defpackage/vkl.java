package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: vkl  reason: default package */
/* loaded from: classes4.dex */
public final class vkl implements vja {
    public vjk[] a;

    private vkl() {
    }

    public static vkl b() {
        return new vkl();
    }

    @Override // defpackage.vja
    public final /* bridge */ /* synthetic */ Object a(viz vizVar) {
        OutputStream f = vizVar.b.f(vizVar.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        if (!vizVar.d.isEmpty()) {
            List<vkq> list = vizVar.d;
            Uri uri = vizVar.e;
            ArrayList arrayList2 = new ArrayList();
            for (vkq vkqVar : list) {
                vkp b = vkqVar.b(uri);
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            vix vixVar = !arrayList2.isEmpty() ? new vix(f, arrayList2) : null;
            if (vixVar != null) {
                arrayList.add(vixVar);
            }
        }
        for (vkr vkrVar : vizVar.c) {
            OutputStream outputStream = (OutputStream) arey.s(arrayList);
            arrayList.add(vkrVar.f());
        }
        Collections.reverse(arrayList);
        vjk[] vjkVarArr = this.a;
        if (vjkVarArr != null) {
            vjk vjkVar = vjkVarArr[0];
            OutputStream outputStream2 = (OutputStream) arey.s(arrayList);
            if (outputStream2 instanceof vjv) {
                vjkVar.b = (vjv) outputStream2;
                vjkVar.a = (OutputStream) arrayList.get(0);
            }
        }
        return (OutputStream) arrayList.get(0);
    }
}
