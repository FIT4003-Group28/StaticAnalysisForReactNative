package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: txd  reason: default package */
/* loaded from: classes4.dex */
public final class txd implements twy {
    private final Context a;
    private final trv b;
    private final ampq c;
    private final tqe d;

    public txd(Context context, trv trvVar, ampq ampqVar, tqe tqeVar) {
        this.a = context;
        this.b = trvVar;
        this.c = ampqVar;
        this.d = tqeVar;
    }

    @Override // defpackage.twy
    public final ankt a() {
        uaw.b(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
        return anlz.q(null);
    }

    @Override // defpackage.twy
    public final ankt c() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences b = uaw.b(this.a, "gms_icing_mdd_shared_files", this.c);
        SharedPreferences.Editor editor = null;
        for (String str : b.getAll().keySet()) {
            try {
                arrayList.add(tzh.b(str, this.a, this.b));
            } catch (tzg e) {
                String valueOf = String.valueOf(str);
                typ.i(e, valueOf.length() != 0 ? "Failed to deserialize newFileKey:".concat(valueOf) : new String("Failed to deserialize newFileKey:"));
                this.b.a(e, "Failed to deserialize newFileKey, unexpected key size: %d", Integer.valueOf(amqf.c("|").h(str).size()));
                if (editor == null) {
                    editor = b.edit();
                }
                editor.remove(str);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return anlz.q(arrayList);
    }

    @Override // defpackage.twy
    public final ankt d() {
        String str;
        String str2;
        tvg a;
        int ordinal;
        String str3;
        String str4;
        boolean z;
        String str5 = "Failed to commit migration version to disk.";
        String str6 = "Fail to set target version ";
        int i = 2;
        boolean z2 = false;
        if (twx.c(this.a)) {
            this.d.p();
            tvg a2 = tvg.a(2);
            tvg b = twx.b(this.a, this.b);
            int i2 = a2.d;
            int i3 = b.d;
            int i4 = 1;
            if (i2 != i3) {
                if (i2 >= i3) {
                    int i5 = i3 + 1;
                    while (i5 <= a2.d) {
                        try {
                            a = tvg.a(i5);
                            ordinal = a.ordinal();
                            str3 = str5;
                        } catch (Throwable th) {
                            th = th;
                            str = str6;
                            str2 = str5;
                        }
                        if (ordinal == i4) {
                            str4 = str6;
                            int i6 = typ.a;
                            SharedPreferences b2 = uaw.b(this.a, "gms_icing_mdd_shared_files", this.c);
                            SharedPreferences.Editor edit = b2.edit();
                            Iterator<String> it = b2.getAll().keySet().iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                try {
                                    tqy b3 = tzh.b(next, this.a, this.b);
                                    tqz tqzVar = (tqz) uaw.d(b2, next, tqz.a.getParserForType());
                                    if (tqzVar == null) {
                                        typ.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit.remove(next);
                                    } else {
                                        uaw.f(edit, next);
                                        uaw.g(edit, tzh.f(b3), tqzVar);
                                    }
                                } catch (tzg e) {
                                    typ.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", next);
                                    this.b.a(e, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                    edit.remove(next);
                                    b2 = b2;
                                    it = it;
                                }
                            }
                            if (!edit.commit()) {
                                typ.b("Failed to commit migration metadata to disk");
                                this.b.a(new Exception("Migrate to DownloadTransform failed."), "Failed to commit migration metadata to disk.", new Object[0]);
                                z = false;
                            }
                            z = true;
                        } else {
                            if (ordinal == i) {
                                try {
                                    int i7 = typ.a;
                                    SharedPreferences b4 = uaw.b(this.a, "gms_icing_mdd_shared_files", this.c);
                                    SharedPreferences.Editor edit2 = b4.edit();
                                    for (String str7 : b4.getAll().keySet()) {
                                        try {
                                            tqy b5 = tzh.b(str7, this.a, this.b);
                                            tqz tqzVar2 = (tqz) uaw.d(b4, str7, tqz.a.getParserForType());
                                            if (tqzVar2 == null) {
                                                typ.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                                edit2.remove(str7);
                                            } else {
                                                uaw.f(edit2, str7);
                                                uaw.g(edit2, tzh.e(b5), tqzVar2);
                                            }
                                        } catch (tzg e2) {
                                            typ.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str7);
                                            SharedPreferences sharedPreferences = b4;
                                            str4 = str6;
                                            try {
                                                this.b.a(e2, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                                edit2.remove(str7);
                                                b4 = sharedPreferences;
                                                str6 = str4;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str2 = str3;
                                                str = str4;
                                            }
                                        }
                                    }
                                    str4 = str6;
                                    if (!edit2.commit()) {
                                        typ.b("Failed to commit migration metadata to disk");
                                        this.b.a(new Exception("Migrate to ChecksumOnly failed."), "Failed to commit migration metadata to disk.", new Object[0]);
                                        z = false;
                                    }
                                    z = true;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = str6;
                                    str2 = str3;
                                }
                            } else {
                                str4 = str6;
                                String name = a.name();
                                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
                                sb.append("Upgrade to version ");
                                sb.append(name);
                                sb.append("not supported!");
                                throw new UnsupportedOperationException(sb.toString());
                            }
                            th = th2;
                            str2 = str3;
                            str = str4;
                            if (twx.b(this.a, this.b).d != a2.d && !twx.d(this.a, a2)) {
                                String valueOf = String.valueOf(a2);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 75);
                                sb2.append("Failed to commit migration version to disk. Fail to set target version to ");
                                sb2.append(valueOf);
                                sb2.append(".");
                                typ.b(sb2.toString());
                                trv trvVar = this.b;
                                String valueOf2 = String.valueOf(a2);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                                sb3.append(str);
                                sb3.append(valueOf2);
                                sb3.append(".");
                                trvVar.a(new Exception(sb3.toString()), str2, new Object[0]);
                            }
                            throw th;
                        }
                        if (z) {
                            twx.d(this.a, tvg.a(i5));
                            i5++;
                            str5 = str3;
                            str6 = str4;
                            i = 2;
                            i4 = 1;
                        } else {
                            if (twx.b(this.a, this.b).d != a2.d && !twx.d(this.a, a2)) {
                                String valueOf3 = String.valueOf(a2);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 75);
                                sb4.append("Failed to commit migration version to disk. Fail to set target version to ");
                                sb4.append(valueOf3);
                                sb4.append(".");
                                typ.b(sb4.toString());
                                trv trvVar2 = this.b;
                                String valueOf4 = String.valueOf(a2);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 28);
                                sb5.append(str4);
                                sb5.append(valueOf4);
                                sb5.append(".");
                                trvVar2.a(new Exception(sb5.toString()), str3, new Object[0]);
                            }
                            z2 = false;
                        }
                    }
                    String str8 = str6;
                    String str9 = str5;
                    if (twx.b(this.a, this.b).d != a2.d && !twx.d(this.a, a2)) {
                        String valueOf5 = String.valueOf(a2);
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 75);
                        sb6.append("Failed to commit migration version to disk. Fail to set target version to ");
                        sb6.append(valueOf5);
                        sb6.append(".");
                        typ.b(sb6.toString());
                        trv trvVar3 = this.b;
                        String valueOf6 = String.valueOf(a2);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 28);
                        sb7.append(str8);
                        sb7.append(valueOf6);
                        sb7.append(".");
                        trvVar3.a(new Exception(sb7.toString()), str9, new Object[0]);
                    }
                } else {
                    typ.e("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", b, a2);
                    trv trvVar4 = this.b;
                    String valueOf7 = String.valueOf(b);
                    String valueOf8 = String.valueOf(a2);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf7).length() + 30 + String.valueOf(valueOf8).length());
                    sb8.append("Downgraded file key from ");
                    sb8.append(valueOf7);
                    sb8.append(" to ");
                    sb8.append(valueOf8);
                    sb8.append(".");
                    trvVar4.a(new Exception(sb8.toString()), "FileKey migrations unexpected downgrade.", new Object[0]);
                    twx.d(this.a, a2);
                }
                return anlz.q(Boolean.valueOf(z2));
            }
            z2 = true;
            return anlz.q(Boolean.valueOf(z2));
        }
        int i8 = typ.a;
        twx.e(this.a);
        Context context = this.a;
        this.d.p();
        twx.d(context, tvg.a(2));
        return anlz.q(false);
    }

    @Override // defpackage.twy
    public final ankt e(tqy tqyVar) {
        return anlz.q((tqz) uaw.d(uaw.b(this.a, "gms_icing_mdd_shared_files", this.c), tzh.c(tqyVar, this.a, this.b), tqz.a.getParserForType()));
    }

    @Override // defpackage.twy
    public final ankt f(tqy tqyVar) {
        return anlz.q(Boolean.valueOf(uaw.h(uaw.b(this.a, "gms_icing_mdd_shared_files", this.c), tzh.c(tqyVar, this.a, this.b))));
    }

    @Override // defpackage.twy
    public final ankt g(tqy tqyVar, tqz tqzVar) {
        return anlz.q(Boolean.valueOf(uaw.i(uaw.b(this.a, "gms_icing_mdd_shared_files", this.c), tzh.c(tqyVar, this.a, this.b), tqzVar)));
    }
}
