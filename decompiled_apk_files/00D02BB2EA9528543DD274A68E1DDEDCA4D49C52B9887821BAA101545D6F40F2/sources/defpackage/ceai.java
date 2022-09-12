package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ceai  reason: default package */
/* loaded from: classes4.dex */
final class ceai<I, O> implements ahp<dmbc, Map<Uri, ? extends String>> {
    public static final ceai a = new ceai();

    @Override // defpackage.ahp
    public final /* bridge */ /* synthetic */ Map<Uri, ? extends String> a(dmbc dmbcVar) {
        dmbc dmbcVar2 = dmbcVar;
        dzvx.b(dmbcVar2, "it");
        dmbg dmbgVar = dmbcVar2.d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        dzvx.b(dmbgVar, "it.content");
        dsrj<dmay> dsrjVar = dmbgVar.d;
        dzvx.b(dsrjVar, "it.content.photoList");
        LinkedHashMap linkedHashMap = new LinkedHashMap(dzwj.a(dztz.a(dzti.d(dsrjVar, 10)), 16));
        for (dmay dmayVar : dsrjVar) {
            dzvx.b(dmayVar, "photo");
            dwfl dwflVar = dmayVar.c;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            dzvx.b(dwflVar, "photo.photoDescription");
            dzsx a2 = dzsz.a(Uri.parse(dwflVar.h), dmayVar.b);
            linkedHashMap.put(a2.a, a2.b);
        }
        return linkedHashMap;
    }
}
