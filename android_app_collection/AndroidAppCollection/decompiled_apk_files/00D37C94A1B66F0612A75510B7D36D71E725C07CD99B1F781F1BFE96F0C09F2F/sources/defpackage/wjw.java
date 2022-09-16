package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: wjw  reason: default package */
/* loaded from: classes4.dex */
public final class wjw implements axou {
    private final azqb a;
    private final /* synthetic */ int b;

    public wjw(azqb azqbVar) {
        this.a = azqbVar;
    }

    public wjw(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public static wjw a(azqb azqbVar) {
        return new wjw(azqbVar);
    }

    public static amqo c(final wwm wwmVar) {
        return new amqo() { // from class: wjt
            @Override // defpackage.amqo
            public final Object get() {
                try {
                    return Boolean.valueOf(wwm.this.a().b);
                } catch (Exception unused) {
                    return true;
                }
            }
        };
    }

    public static amqo d(final aapk aapkVar) {
        aapkVar.getClass();
        return new amqo() { // from class: aape
            @Override // defpackage.amqo
            public final Object get() {
                aapk aapkVar2 = aapk.this;
                aopa c = aapkVar2.c();
                aaqd aaqdVar = (aaqd) aapkVar2.a.c;
                String string = aaqdVar.i() ? aaqdVar.h.a : aaqdVar.d.getString("com.google.android.libraries.youtube.innertube.hot_hash_data", "");
                aaqd aaqdVar2 = (aaqd) aapkVar2.f.a;
                String string2 = aaqdVar2.i() ? aaqdVar2.i.a : aaqdVar2.d.getString("com.google.android.libraries.youtube.innertube.cold_hash_data", "");
                String str = aapkVar2.f.b().c;
                if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(str)) {
                    arox aroxVar = ((arow) c.instance).y;
                    if (aroxVar == null) {
                        aroxVar = arox.a;
                    }
                    aopa mo52toBuilder = aroxVar.mo52toBuilder();
                    if (TextUtils.isEmpty(string)) {
                        mo52toBuilder.copyOnWrite();
                        arox aroxVar2 = (arox) mo52toBuilder.instance;
                        aroxVar2.b &= -9;
                        aroxVar2.e = arox.a.e;
                    } else {
                        mo52toBuilder.copyOnWrite();
                        arox aroxVar3 = (arox) mo52toBuilder.instance;
                        string.getClass();
                        aroxVar3.b |= 8;
                        aroxVar3.e = string;
                    }
                    if (TextUtils.isEmpty(string2)) {
                        mo52toBuilder.copyOnWrite();
                        arox aroxVar4 = (arox) mo52toBuilder.instance;
                        aroxVar4.b &= -5;
                        aroxVar4.d = arox.a.d;
                    } else {
                        mo52toBuilder.copyOnWrite();
                        arox aroxVar5 = (arox) mo52toBuilder.instance;
                        string2.getClass();
                        aroxVar5.b |= 4;
                        aroxVar5.d = string2;
                    }
                    if (TextUtils.isEmpty(str)) {
                        mo52toBuilder.copyOnWrite();
                        arox aroxVar6 = (arox) mo52toBuilder.instance;
                        aroxVar6.b &= -2;
                        aroxVar6.c = arox.a.c;
                    } else {
                        mo52toBuilder.copyOnWrite();
                        arox aroxVar7 = (arox) mo52toBuilder.instance;
                        str.getClass();
                        aroxVar7.b |= 1;
                        aroxVar7.c = str;
                    }
                    c.copyOnWrite();
                    arow arowVar = (arow) c.instance;
                    arox aroxVar8 = (arox) mo52toBuilder.mo39build();
                    aroxVar8.getClass();
                    arowVar.y = aroxVar8;
                    arowVar.c |= 16384;
                }
                aakl aaklVar = aapkVar2.c;
                ArrayList arrayList = new ArrayList();
                try {
                    Map map = (Map) anlz.c(((abfh) aaklVar.a.get()).b());
                    for (String str2 : ((amup) aaklVar.b).keySet()) {
                        int intValue = map.containsKey(str2) ? ((Integer) map.get(str2)).intValue() : -1;
                        if (intValue != 0 && intValue != -1) {
                            arrayList.add(Integer.valueOf(intValue));
                        }
                    }
                } catch (ExecutionException e) {
                    zep.d("Failed to read the client side experiments map from the disk", e);
                }
                if (!arrayList.isEmpty()) {
                    c.copyOnWrite();
                    arow arowVar2 = arow.a;
                    ((arow) c.instance).n = arow.emptyIntList();
                    c.copyOnWrite();
                    arow arowVar3 = (arow) c.instance;
                    aopq aopqVar = arowVar3.n;
                    if (!aopqVar.c()) {
                        arowVar3.n = aopi.mutableCopy(aopqVar);
                    }
                    aonk.addAll((Iterable) arrayList, (List) arowVar3.n);
                }
                aapkVar2.b.b(c);
                return (arow) c.mo39build();
            }
        };
    }

    public static amqo e(final aapk aapkVar) {
        aapkVar.getClass();
        return new amqo() { // from class: aapf
            @Override // defpackage.amqo
            public final Object get() {
                return (arow) aapk.this.c().mo39build();
            }
        };
    }

    public static wjw f(azqb azqbVar) {
        return new wjw(azqbVar, 1);
    }

    public static wjw g(azqb azqbVar) {
        return new wjw(azqbVar, 2);
    }

    public static wjw h(azqb azqbVar) {
        return new wjw(azqbVar, 3);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return b();
            }
            if (i == 2) {
                return b();
            }
            return b();
        }
        return b();
    }

    public final amqo b() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return ((wwk) this.a.get()).a();
            }
            if (i == 2) {
                return d((aapk) this.a.get());
            }
            return e((aapk) this.a.get());
        }
        return c((wwm) this.a.get());
    }
}
