package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaut  reason: default package */
/* loaded from: classes.dex */
public final class aaut extends aaqs {
    public String a;
    public List b;
    public String c;
    public int d;

    public aaut(aaqf aaqfVar, afvm afvmVar) {
        super("share/get_share_panel", aaqfVar, afvmVar, 3);
        i();
    }

    public static String t(String str, List list) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(num);
            }
        }
        afrt afrtVar = new afrt();
        afrtVar.c("serviceName", "share/get_share_panel");
        afrtVar.c("serializedSharedEntity", str);
        afrtVar.c("installedSharingServiceIds", sb.toString());
        return afrtVar.a();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = armz.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        armz armzVar = (armz) createBuilder.instance;
        str.getClass();
        armzVar.b |= 2;
        armzVar.d = str;
        int i = this.d;
        createBuilder.copyOnWrite();
        armz armzVar2 = (armz) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            armzVar2.f = i2;
            armzVar2.b |= 8;
            List list = this.b;
            if (list != null) {
                createBuilder.copyOnWrite();
                armz armzVar3 = (armz) createBuilder.instance;
                aopq aopqVar = armzVar3.e;
                if (!aopqVar.c()) {
                    armzVar3.e = aopi.mutableCopy(aopqVar);
                }
                aonk.addAll((Iterable) list, (List) armzVar3.e);
            }
            String str2 = this.c;
            if (str2 != null) {
                createBuilder.copyOnWrite();
                armz armzVar4 = (armz) createBuilder.instance;
                armzVar4.b |= 16;
                armzVar4.g = str2;
            }
            return createBuilder;
        }
        throw null;
    }

    @Override // defpackage.aapd
    public final String b() {
        return t(this.a, this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
    }
}
