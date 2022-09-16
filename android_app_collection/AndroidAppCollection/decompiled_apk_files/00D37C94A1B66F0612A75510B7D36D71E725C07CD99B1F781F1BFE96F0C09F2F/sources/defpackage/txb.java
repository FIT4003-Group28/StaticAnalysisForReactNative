package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: txb  reason: default package */
/* loaded from: classes4.dex */
public final class txb implements tul {
    public final Executor a;
    private final Context b;
    private final snc c;
    private final trv d;
    private final ampq e;

    public txb(Context context, snc sncVar, trv trvVar, ampq ampqVar, Executor executor) {
        this.b = context;
        this.c = sncVar;
        this.d = trvVar;
        this.e = ampqVar;
        this.a = executor;
    }

    @Override // defpackage.tul
    public final ankt a(tqm tqmVar) {
        int i = typ.a;
        tqm f = tzc.f(tqmVar, (this.c.c() / 1000) + tqmVar.j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        return m(arrayList);
    }

    @Override // defpackage.tul
    public final ankt b() {
        uaw.b(this.b, "gms_icing_mdd_groups", this.e).edit().clear().commit();
        uaw.b(this.b, "gms_icing_mdd_group_key_properties", this.e).edit().clear().commit();
        return k();
    }

    @Override // defpackage.tul
    public final ankt c() {
        return anii.i(d(), new anir() { // from class: txa
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                txb txbVar = txb.this;
                final List<tqv> list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                for (tqv tqvVar : list) {
                    arrayList.add(txbVar.g(tqvVar));
                }
                return anlz.j(arrayList).b(new aniq() { // from class: twz
                    @Override // defpackage.aniq
                    public final ankt a() {
                        List list2 = list;
                        List list3 = arrayList;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < list2.size(); i++) {
                            tqv tqvVar2 = (tqv) list2.get(i);
                            tqm tqmVar = (tqm) anlz.y((Future) list3.get(i));
                            if (tqmVar != null) {
                                arrayList2.add(Pair.create(tqvVar2, tqmVar));
                            }
                        }
                        return anlz.q(arrayList2);
                    }
                }, txbVar.a);
            }
        }, this.a);
    }

    @Override // defpackage.tul
    public final ankt d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences b = uaw.b(this.b, "gms_icing_mdd_groups", this.e);
        SharedPreferences.Editor editor = null;
        for (String str : b.getAll().keySet()) {
            try {
                arrayList.add(tzh.i(str));
            } catch (tzd e) {
                String valueOf = String.valueOf(str);
                typ.i(e, valueOf.length() != 0 ? "Failed to deserialize groupKey:".concat(valueOf) : new String("Failed to deserialize groupKey:"));
                this.d.a(e, "Failed to deserialize groupKey", new Object[0]);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // defpackage.tul
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt e() {
        /*
            r7 = this;
            java.lang.String r0 = "FileGroupsMetadataUtil"
            android.content.Context r1 = r7.b
            ampq r2 = r7.e
            java.io.File r1 = defpackage.tzh.j(r1, r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L58
            r2.<init>(r1)     // Catch: java.io.FileNotFoundException -> L58
            r3 = 0
            r4 = 1
            long r5 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L49
            int r1 = (int) r5     // Catch: java.lang.IllegalArgumentException -> L49
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.IllegalArgumentException -> L49
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch: java.io.IOException -> L36
            r5.read(r1)     // Catch: java.io.IOException -> L36
            r1.rewind()     // Catch: java.io.IOException -> L36
            java.lang.Class<tqm> r5 = defpackage.tqm.class
            tqm r6 = defpackage.tqm.a     // Catch: java.io.IOException -> L36
            aorb r6 = r6.getParserForType()     // Catch: java.io.IOException -> L36
            java.util.List r1 = defpackage.tzh.h(r1, r5, r6)     // Catch: java.io.IOException -> L36
            r2.close()     // Catch: java.io.IOException -> L34
            goto L42
        L34:
            r2 = move-exception
            goto L39
        L36:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L39:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            java.lang.String r0 = "%s: IOException occurred while reading file groups."
            defpackage.typ.f(r2, r0, r4)
        L42:
            if (r1 != 0) goto L61
            amuk r1 = defpackage.amuk.q()
            goto L61
        L49:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "%s: Exception while reading from stale groups into buffer."
            defpackage.typ.f(r1, r0, r2)
            amuk r1 = defpackage.amuk.q()
            goto L61
        L58:
            r1.getAbsolutePath()
            int r0 = defpackage.typ.a
            amuk r1 = defpackage.amuk.q()
        L61:
            ankt r0 = defpackage.anlz.q(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txb.e():ankt");
    }

    @Override // defpackage.tul
    public final ankt f() {
        return ankq.a;
    }

    @Override // defpackage.tul
    public final ankt g(tqv tqvVar) {
        return anlz.q((tqm) uaw.d(uaw.b(this.b, "gms_icing_mdd_groups", this.e), tzh.k(tqvVar), tqm.a.getParserForType()));
    }

    @Override // defpackage.tul
    public final ankt h(tqv tqvVar) {
        return anlz.q((tqw) uaw.d(uaw.b(this.b, "gms_icing_mdd_group_key_properties", this.e), tzh.k(tqvVar), tqw.a.getParserForType()));
    }

    @Override // defpackage.tul
    public final ankt i(tqv tqvVar) {
        return anlz.q(Boolean.valueOf(uaw.h(uaw.b(this.b, "gms_icing_mdd_groups", this.e), tzh.k(tqvVar))));
    }

    @Override // defpackage.tul
    public final ankt j(List list) {
        SharedPreferences.Editor edit = uaw.b(this.b, "gms_icing_mdd_groups", this.e).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tqv tqvVar = (tqv) it.next();
            String str = tqvVar.c;
            String str2 = tqvVar.d;
            int i = typ.a;
            edit.remove(uaw.e(tqvVar));
        }
        return anlz.q(Boolean.valueOf(edit.commit()));
    }

    @Override // defpackage.tul
    public final ankt k() {
        n().delete();
        return ankq.a;
    }

    @Override // defpackage.tul
    public final ankt l(tqv tqvVar, tqm tqmVar) {
        return anlz.q(Boolean.valueOf(uaw.i(uaw.b(this.b, "gms_icing_mdd_groups", this.e), tzh.k(tqvVar), tqmVar)));
    }

    @Override // defpackage.tul
    public final ankt m(List list) {
        File n = n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(n, true);
            try {
                ByteBuffer g = tzh.g(list);
                if (g != null) {
                    fileOutputStream.getChannel().write(g);
                }
                fileOutputStream.close();
                return anlz.q(true);
            } catch (IOException unused) {
                typ.b("IOException occurred while writing file groups.");
                return anlz.q(false);
            }
        } catch (FileNotFoundException unused2) {
            typ.c("File %s not found while writing.", n.getAbsolutePath());
            return anlz.q(false);
        }
    }

    final File n() {
        return tzh.j(this.b, this.e);
    }
}
