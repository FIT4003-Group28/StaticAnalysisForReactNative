package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: aapz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aapz implements ampg {
    private final /* synthetic */ int r;
    public static final /* synthetic */ aapz q = new aapz(20);
    public static final /* synthetic */ aapz p = new aapz(19);
    public static final /* synthetic */ aapz o = new aapz(18);
    public static final /* synthetic */ aapz n = new aapz(16);
    public static final /* synthetic */ aapz m = new aapz(15);
    public static final /* synthetic */ aapz l = new aapz(11);
    public static final /* synthetic */ aapz k = new aapz(10);
    public static final /* synthetic */ aapz j = new aapz(9);
    public static final /* synthetic */ aapz i = new aapz(8);
    public static final /* synthetic */ aapz h = new aapz(7);
    public static final /* synthetic */ aapz g = new aapz(6);
    public static final /* synthetic */ aapz f = new aapz(5);
    public static final /* synthetic */ aapz e = new aapz(4);
    public static final /* synthetic */ aapz d = new aapz(3);
    public static final /* synthetic */ aapz c = new aapz(2);
    public static final /* synthetic */ aapz b = new aapz(1);
    public static final /* synthetic */ aapz a = new aapz();

    private /* synthetic */ aapz() {
    }

    public /* synthetic */ aapz(int i2) {
        this.r = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.r) {
            case 0:
                ardu arduVar = (ardu) obj;
                if (arduVar.d == 7) {
                    return (aoob) arduVar.e;
                }
                return aoob.b;
            case 1:
                ardu arduVar2 = (ardu) obj;
                if (arduVar2.b == 6) {
                    return (aoob) arduVar2.c;
                }
                return aoob.b;
            case 2:
                return ((ardu) obj).g;
            case 3:
                return ((ardu) obj).f;
            case 4:
                ardu arduVar3 = (ardu) obj;
                return arduVar3.b == 1 ? (String) arduVar3.c : "";
            case 5:
                ardu arduVar4 = (ardu) obj;
                return arduVar4.d == 3 ? (String) arduVar4.e : "";
            case 6:
                return new aart((Throwable) obj);
            case 7:
                return new abcn((ascp) obj);
            case 8:
                ascq ascqVar = (ascq) obj;
                ArrayList arrayList = new ArrayList();
                int i2 = ascqVar.b;
                if (i2 == 88478200) {
                    apwh apwhVar = (apwh) ascqVar.c;
                    if (apwhVar.e) {
                        arrayList.add(abir.c(apwhVar));
                    }
                    if (apwhVar.d) {
                        arrayList.add(new abci());
                    }
                } else if (i2 == 66930374) {
                    arrayList.add((aurh) ascqVar.c);
                }
                return arrayList;
            case 9:
                return Boolean.valueOf(((awtk) obj).c);
            case 10:
                return Collections.unmodifiableMap(((awtm) obj).e);
            case 11:
                atzv atzvVar = ((awtm) obj).c;
                return atzvVar == null ? atzv.a : atzvVar;
            case 12:
                aopa mo52toBuilder = ((aotz) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                aotz aotzVar = (aotz) mo52toBuilder.instance;
                aotzVar.b |= 8;
                aotzVar.f = true;
                return (aotz) mo52toBuilder.mo39build();
            case 13:
                aopa mo52toBuilder2 = ((aotz) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                aotz aotzVar2 = (aotz) mo52toBuilder2.instance;
                aotzVar2.b |= 2;
                aotzVar2.d = true;
                return (aotz) mo52toBuilder2.mo39build();
            case 14:
                aopa mo52toBuilder3 = ((aotz) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                aotz aotzVar3 = (aotz) mo52toBuilder3.instance;
                aotzVar3.b |= 4;
                aotzVar3.e = false;
                return (aotz) mo52toBuilder3.mo39build();
            case 15:
                aopa mo52toBuilder4 = ((aotz) obj).mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                aotz aotzVar4 = (aotz) mo52toBuilder4.instance;
                aotzVar4.b |= 64;
                aotzVar4.i = true;
                return (aotz) mo52toBuilder4.mo39build();
            case 16:
                if (1 == (((atpl) obj).b & 1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                awtn awtnVar = (awtn) obj;
                String str = acrk.a;
                if ((awtnVar.b & 2) == 0) {
                    return null;
                }
                aoob aoobVar = awtnVar.d;
                try {
                    return (Throwable) new ObjectInputStream(aoobVar.m()).readObject();
                } catch (IOException | ClassNotFoundException unused) {
                    String str2 = acrk.a;
                    String valueOf = String.valueOf(aoobVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Failed to deserialize throwable. [");
                    sb.append(valueOf);
                    sb.append("]");
                    zep.c(str2, sb.toString());
                    return null;
                }
            case 18:
                String str3 = acrk.a;
                aopa mo52toBuilder5 = ((awtn) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                awtn awtnVar2 = (awtn) mo52toBuilder5.instance;
                awtnVar2.b &= -3;
                awtnVar2.d = awtn.a.d;
                return (awtn) mo52toBuilder5.mo39build();
            case 19:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                aopa createBuilder = awtn.a.createBuilder();
                if (sharedPreferences.contains("interaction_logging_client_side_ve_counter")) {
                    long j2 = sharedPreferences.getLong("interaction_logging_client_side_ve_counter", 10000L);
                    createBuilder.copyOnWrite();
                    awtn awtnVar3 = (awtn) createBuilder.instance;
                    awtnVar3.b |= 16;
                    awtnVar3.g = j2;
                }
                return (awtn) createBuilder.mo39build();
            default:
                return Boolean.valueOf(((awtn) obj).f);
        }
    }
}
