package defpackage;

import android.content.Context;
import android.database.DataSetObservable;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zsn  reason: default package */
/* loaded from: classes4.dex */
public final class zsn implements zsx, znr, znq {
    public final zsy a;
    public byte[] c;
    public DataSetObservable d;
    public zrh g;
    public zrr h;
    private final znk i;
    private boolean m;
    public final ArrayList b = new ArrayList();
    private final ArrayList j = new ArrayList();
    private final Map k = new HashMap();
    private final Set l = EnumSet.noneOf(avxv.class);
    public final Object e = new Object();
    public final Object f = new Object();

    public zsn(Context context, yqw yqwVar, znk znkVar, zte zteVar) {
        this.i = znkVar;
        this.a = new zsy(context, yqwVar, this, false, zteVar);
    }

    private final zno j(avxu avxuVar) {
        zno znoVar = new zno(avxuVar);
        znoVar.b(FilterMapTable$FilterDescriptor.a(this.b, "NORMAL"));
        znoVar.c = "NORMAL";
        znoVar.b = "NORMAL";
        return znoVar;
    }

    @Override // defpackage.znr
    public final boolean a(avxv avxvVar) {
        return avxvVar != null && this.l.contains(avxvVar);
    }

    public final avxr b() {
        aopa createBuilder = avxr.a.createBuilder();
        List asList = Arrays.asList(this.a.i());
        createBuilder.copyOnWrite();
        avxr avxrVar = (avxr) createBuilder.instance;
        aopu aopuVar = avxrVar.c;
        if (!aopuVar.c()) {
            avxrVar.c = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) asList, (List) avxrVar.c);
        zof zofVar = new zof();
        zofVar.a();
        String str = zofVar.e;
        zofVar.a();
        String str2 = zofVar.f;
        aopa createBuilder2 = avxp.a.createBuilder();
        if (str != null) {
            createBuilder2.copyOnWrite();
            avxp avxpVar = (avxp) createBuilder2.instance;
            avxpVar.b |= 1;
            avxpVar.c = str;
        }
        if (str2 != null) {
            createBuilder2.copyOnWrite();
            avxp avxpVar2 = (avxp) createBuilder2.instance;
            avxpVar2.b |= 2;
            avxpVar2.d = str2;
        }
        aopa createBuilder3 = avxq.a.createBuilder();
        try {
            String str3 = Build.DEVICE;
            createBuilder3.copyOnWrite();
            avxq avxqVar = (avxq) createBuilder3.instance;
            str3.getClass();
            avxqVar.b |= 2;
            avxqVar.d = str3;
        } catch (RuntimeException e) {
            zep.n("Failed to set VideoEffectsContext.Device.device: ", e);
        }
        createBuilder3.copyOnWrite();
        avxq avxqVar2 = (avxq) createBuilder3.instance;
        avxp avxpVar3 = (avxp) createBuilder2.mo39build();
        avxpVar3.getClass();
        avxqVar2.c = avxpVar3;
        avxqVar2.b |= 1;
        createBuilder.copyOnWrite();
        avxr avxrVar2 = (avxr) createBuilder.instance;
        avxq avxqVar3 = (avxq) createBuilder3.mo39build();
        avxqVar3.getClass();
        avxrVar2.d = avxqVar3;
        avxrVar2.b |= 1;
        return (avxr) createBuilder.mo39build();
    }

    public final void c() {
        zrr zrrVar = this.h;
        if (zrrVar == null || !this.m) {
            return;
        }
        byte[] bArr = this.c;
        Set set = this.l;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.j;
        String d = this.a.d();
        znk znkVar = this.i;
        zsc zscVar = zrrVar.a;
        zsn zsnVar = zrrVar.b;
        synchronized (zscVar.e) {
            if (zscVar.c) {
                zep.b("EffectsSettings already set, not setting KazooEffectsLoader Settings.");
            } else {
                zscVar.c = true;
                zscVar.h.f(zsnVar.a);
                synchronized (zsnVar.f) {
                    zsnVar.g = zscVar;
                }
                zscVar.m(set);
                synchronized (zscVar.k) {
                    zscVar.g = new zso(bArr, d);
                    zxq.c(zscVar.k, zscVar.g);
                    zscVar.k.clear();
                }
                zscVar.l(arrayList, arrayList2, znkVar);
            }
        }
        this.h = null;
    }

    @Override // defpackage.zsx
    public final void d(String str, String str2) {
        boolean z = false;
        for (String str3 : this.k.keySet()) {
            Set set = (Set) this.k.get(str3);
            if (set.contains(str)) {
                set.remove(str);
                if (set.isEmpty()) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) arrayList.get(i);
                            i++;
                            if (filterMapTable$FilterDescriptor.a.equals(str3)) {
                                filterMapTable$FilterDescriptor.d();
                                String valueOf = String.valueOf(str3);
                                if (valueOf.length() != 0) {
                                    "A new effect is ready: ".concat(valueOf);
                                }
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        DataSetObservable dataSetObservable = this.d;
        if (dataSetObservable != null && z) {
            dataSetObservable.notifyChanged();
        }
        synchronized (this.f) {
            zrh zrhVar = this.g;
            if (zrhVar != null) {
                zrhVar.a(str2);
                if (z) {
                    this.g.b();
                }
            }
        }
    }

    public final void e(avyp avypVar) {
        f(avypVar, true);
    }

    public final void f(avyp avypVar, boolean z) {
        g(avypVar, z, "android_builtin_effects_settings.binarypb");
    }

    public final void g(avyp avypVar, boolean z, String str) {
        boolean z2 = false;
        boolean z3 = true;
        if (avypVar != null) {
            z2 = h(avypVar, false);
            if (!z2) {
                String str2 = true != z ? "Built-in fallback not allowed." : "Using built-in effects.";
                zep.b(str2.length() != 0 ? "VideoEffectsSettings from InnerTube is invalid. ".concat(str2) : new String("VideoEffectsSettings from InnerTube is invalid. "));
            }
        } else {
            String str3 = true != z ? "Built-in fallback not allowed." : "Using built-in effects.";
            zep.g(str3.length() != 0 ? "No VideoEffectsSettings provided. ".concat(str3) : new String("No VideoEffectsSettings provided. "));
        }
        if (!z || z2) {
            z3 = z2;
        } else {
            this.b.clear();
            this.k.clear();
            this.l.clear();
            try {
                InputStream open = this.a.c.getAssets().open(str);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zsy.e(open, byteArrayOutputStream);
                avyp avypVar2 = (avyp) aopi.parseFrom(avyp.a, byteArrayOutputStream.toByteArray(), aoos.b());
                open.close();
                byteArrayOutputStream.close();
                aqxo.y(h(avypVar2, true));
            } catch (IOException e) {
                throw new RuntimeException(str.length() != 0 ? "Failed to load or parse: ".concat(str) : new String("Failed to load or parse: "), e);
            }
        }
        synchronized (this.e) {
            this.m = z3;
            c();
        }
    }

    final boolean h(avyp avypVar, boolean z) {
        aqxo.p(this.b.isEmpty());
        aqxo.p(this.k.isEmpty());
        aqxo.p(this.l.isEmpty());
        avypVar.getClass();
        this.c = avypVar.d.I();
        HashSet hashSet = new HashSet();
        Iterator it = avypVar.c.iterator();
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            avyn avynVar = (avyn) it.next();
            arag aragVar = avynVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            Spanned b = ajgl.b(aragVar);
            String obj = b == null ? null : b.toString();
            String str = avynVar.b;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(obj)) {
                String valueOf = String.valueOf(avynVar.toString().replace('\"', '`'));
                afus.c(2, 9, valueOf.length() != 0 ? "Invalid effect from server: ".concat(valueOf) : new String("Invalid effect from server: "), new Exception());
                String valueOf2 = String.valueOf(avynVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb.append("Invalid effect from server: ");
                sb.append(valueOf2);
                zep.b(sb.toString());
            } else {
                if (avynVar.e.size() == 0) {
                    z3 = false;
                }
                FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = new FilterMapTable$FilterDescriptor(str, obj, z3, z);
                filterMapTable$FilterDescriptor.c = avynVar.c;
                this.b.add(filterMapTable$FilterDescriptor);
                if (z3) {
                    this.k.put(str, new HashSet(avynVar.e));
                    hashSet.addAll(avynVar.e);
                }
                z2 |= FilterMapTable$FilterDescriptor.h(str);
            }
        }
        if (!avypVar.h.isEmpty()) {
            for (avym avymVar : avypVar.h) {
                avxu b2 = avxu.b(avymVar.b);
                if (b2 == null) {
                    b2 = avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                }
                zno j = j(b2);
                for (String str2 : avymVar.c) {
                    if (FilterMapTable$FilterDescriptor.h(str2)) {
                        avxu b3 = avxu.b(avymVar.b);
                        if (b3 == null) {
                            b3 = avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                        }
                        String valueOf3 = String.valueOf(b3);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                        sb2.append(valueOf3);
                        sb2.append(": Skipping NORMAL (implicitly added)");
                        zep.g(sb2.toString());
                    } else {
                        FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.b, str2);
                        if (a == null) {
                            avxu b4 = avxu.b(avymVar.b);
                            if (b4 == null) {
                                b4 = avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                            }
                            int i = b4.d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 44);
                            sb3.append("Invalid Effect ID ");
                            sb3.append(str2);
                            sb3.append(" in subpackage ");
                            sb3.append(i);
                            zep.b(sb3.toString());
                        } else {
                            j.b(a);
                        }
                    }
                }
                this.j.add(j);
            }
        } else {
            zno j2 = j(avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED);
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = (FilterMapTable$FilterDescriptor) arrayList.get(i2);
                if (!FilterMapTable$FilterDescriptor.h(filterMapTable$FilterDescriptor2.a)) {
                    j2.b(filterMapTable$FilterDescriptor2);
                }
            }
            this.j.add(j2);
        }
        hashSet.addAll(avypVar.e);
        if ((avypVar.b & 2) != 0) {
            Set set = this.l;
            avyo avyoVar = avypVar.g;
            if (avyoVar == null) {
                avyoVar = avyo.b;
            }
            set.addAll(new aops(avyoVar.c, avyo.a));
        }
        new zsl(this.a, avypVar, hashSet).execute(new Void[0]);
        byte[] bArr = this.c;
        return bArr != null && bArr.length > 0 && z2;
    }

    public final zsk i() {
        if (this.c == null || this.b.isEmpty()) {
            return null;
        }
        return new zsk(this);
    }
}
