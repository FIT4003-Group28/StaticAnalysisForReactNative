package defpackage;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ydy  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ydy implements ampg {
    private final /* synthetic */ int u;
    public static final /* synthetic */ ydy t = new ydy(20);
    public static final /* synthetic */ ydy s = new ydy(19);
    public static final /* synthetic */ ydy r = new ydy(18);
    public static final /* synthetic */ ydy q = new ydy(17);
    public static final /* synthetic */ ydy p = new ydy(16);
    public static final /* synthetic */ ydy o = new ydy(15);
    public static final /* synthetic */ ydy n = new ydy(14);
    public static final /* synthetic */ ydy m = new ydy(13);
    public static final /* synthetic */ ydy l = new ydy(11);
    public static final /* synthetic */ ydy k = new ydy(10);
    public static final /* synthetic */ ydy j = new ydy(9);
    public static final /* synthetic */ ydy i = new ydy(8);
    public static final /* synthetic */ ydy h = new ydy(7);
    public static final /* synthetic */ ydy g = new ydy(6);
    public static final /* synthetic */ ydy f = new ydy(5);
    public static final /* synthetic */ ydy e = new ydy(4);
    public static final /* synthetic */ ydy d = new ydy(3);
    public static final /* synthetic */ ydy c = new ydy(2);
    public static final /* synthetic */ ydy b = new ydy(1);
    public static final /* synthetic */ ydy a = new ydy();

    private /* synthetic */ ydy() {
    }

    public /* synthetic */ ydy(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.u) {
            case 0:
                return Boolean.valueOf(((kud) obj).c);
            case 1:
                return Boolean.valueOf(((kud) obj).i);
            case 2:
                return new yks((File) obj);
            case 3:
                return new Exception((Throwable) obj);
            case 4:
                return new Exception((Throwable) obj);
            case 5:
                return Integer.valueOf(((znc) obj).b);
            case 6:
                awti awtiVar = (awti) obj;
                if (awtiVar == null) {
                    return null;
                }
                return Collections.unmodifiableMap(awtiVar.d);
            case 7:
                return Boolean.valueOf(znl.a(new znl(((Integer) obj).intValue())));
            case 8:
                return Boolean.valueOf(znl.b(new znl(((Integer) obj).intValue())));
            case 9:
                Map map = zsz.a;
                aopa createBuilder = avyb.a.createBuilder();
                String str = ((axbz) obj).c;
                createBuilder.copyOnWrite();
                avyb avybVar = (avyb) createBuilder.instance;
                str.getClass();
                avybVar.b = 1 | avybVar.b;
                avybVar.c = str;
                return (avyb) createBuilder.mo39build();
            case 10:
                aopa aopaVar = (aopa) obj;
                aopaVar.copyOnWrite();
                awti awtiVar2 = (awti) aopaVar.instance;
                awti awtiVar3 = awti.a;
                awtiVar2.b |= 1;
                awtiVar2.c = 1;
                return aopaVar;
            case 11:
                if (((awti) obj).c > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                List<aacm> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (aacm aacmVar : list) {
                    if (aacmVar != null) {
                        arrayList.add(aacmVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(aacm.AVAILABLE);
                }
                return (aacm) Collections.max(arrayList, aacl.a);
            case 13:
                aouc aoucVar = (aouc) obj;
                aopa mo52toBuilder = aoucVar.mo52toBuilder();
                int i2 = aoucVar.c;
                mo52toBuilder.copyOnWrite();
                aouc aoucVar2 = (aouc) mo52toBuilder.instance;
                aoucVar2.b |= 1;
                aoucVar2.c = i2 + 1;
                return (aouc) mo52toBuilder.mo39build();
            case 14:
                aopa mo52toBuilder2 = ((aouc) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                aouc aoucVar3 = (aouc) mo52toBuilder2.instance;
                aoucVar3.b &= -2;
                aoucVar3.c = 0;
                return (aouc) mo52toBuilder2.mo39build();
            case 15:
                zep.d("Failed to read vix snapshot.", (Exception) obj);
                return false;
            case 16:
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && !str2.startsWith(".") && str2.split("\\.").length >= 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return (aafo) ((azqb) obj).get();
            case 18:
                return (aafo) ((azqb) obj).get();
            case 19:
                return ((aakd) obj).b;
            default:
                int i3 = aaje.a;
                return ((aqwd) obj).c;
        }
    }
}
