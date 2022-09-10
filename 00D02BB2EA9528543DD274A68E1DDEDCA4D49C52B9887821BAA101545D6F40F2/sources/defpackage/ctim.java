package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.google.android.filament.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ctim  reason: default package */
/* loaded from: classes5.dex */
public final class ctim implements cusm {
    public static final /* synthetic */ int h = 0;
    private static final String i;
    public final Context a;
    public final ctxo b;
    final long c;
    public final dcdc<cugo> d = dcdc.f(cugo.INCOMING_RECEIVED);
    public final dehp e = cstu.b().a;
    public LruCache<ctlp, cuss<?>> f;
    public final ctir g;
    private final ctgb j;

    static {
        String valueOf = String.valueOf(ctiw.a("conversations", "id"));
        i = valueOf.length() != 0 ? "messages INNER JOIN conversations ON conversation_row_id = ".concat(valueOf) : new String("messages INNER JOIN conversations ON conversation_row_id = ");
    }

    public ctim(Context context, ctxo ctxoVar, ctgb ctgbVar, ctir ctirVar, long j) {
        this.a = context.getApplicationContext();
        this.b = ctxoVar;
        this.j = ctgbVar;
        this.g = ctirVar;
        this.c = j;
    }

    private final <T> cuss<T> aA(ctlp ctlpVar, Callable<cuss<T>> callable) {
        cuss<T> call;
        cuss<T> cussVar = (cuss<T>) ay(ctlpVar);
        if (cussVar == null) {
            try {
                call = callable.call();
            } catch (Exception unused) {
            }
            try {
                az(ctlpVar, call);
                return call;
            } catch (Exception unused2) {
                cussVar = call;
                cstl.a("SQLiteMessagingStore");
                return cussVar;
            }
        }
        return cussVar;
    }

    private static final Pair<String, String[]> aB(String str, ContactId contactId) {
        String a;
        String sb;
        String a2 = ctiw.a(str, "lighter_id_normalized_id");
        String a3 = ctiw.a(str, "lighter_id_type");
        String a4 = ctiw.a(str, "lighter_id_app_name");
        StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 20 + String.valueOf(a3).length() + String.valueOf(a4).length());
        sb2.append(a2);
        sb2.append(" =? AND ");
        sb2.append(a3);
        sb2.append(" =? AND ");
        sb2.append(a4);
        sb2.append(" =? ");
        String sb3 = sb2.toString();
        if (contactId.c() == ContactId.ContactType.EMAIL) {
            a = cstg.a(contactId.a());
        } else {
            a = contactId.a();
        }
        String[] strArr = {a, Integer.toString(contactId.c().f), contactId.b()};
        if (contactId.d().a()) {
            String valueOf = String.valueOf(sb3);
            String a5 = ctiw.a(str, "lighter_handler_id");
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 9 + String.valueOf(a5).length());
            sb4.append(valueOf);
            sb4.append(" AND ");
            sb4.append(a5);
            sb4.append(" =? ");
            sb = sb4.toString();
            strArr = (String[]) dclq.d(strArr, contactId.d().b());
        } else {
            String valueOf2 = String.valueOf(sb3);
            String a6 = ctiw.a(str, "lighter_handler_id");
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 14 + String.valueOf(a6).length());
            sb5.append(valueOf2);
            sb5.append(" AND ");
            sb5.append(a6);
            sb5.append(" is NULL ");
            sb = sb5.toString();
        }
        return Pair.create(sb, strArr);
    }

    private static final String aC() {
        String a = ctiw.a("o", "id");
        String a2 = ctiw.a("c", "id");
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle + String.valueOf(a2).length());
        sb.append("((conversations INNER JOIN contacts AS ");
        sb.append("o");
        sb.append(" ON ");
        sb.append("owner_row_id");
        sb.append(" = ");
        sb.append(a);
        sb.append(") LEFT JOIN ");
        sb.append("contacts");
        sb.append(" AS ");
        sb.append("c");
        sb.append(" ON ");
        sb.append("other_contact_row_id");
        sb.append(" = ");
        sb.append(a2);
        sb.append(")");
        return sb.toString();
    }

    private final ctlp aD(String[] strArr, int i2, int i3, dbsl<?> dbslVar) {
        ctlo i4 = ctlp.i();
        i4.d(ak(aC()));
        ctky ctkyVar = (ctky) i4;
        ctkyVar.a = dcdc.t(ctiw.c(ctiw.b("conversations", strArr), ctiw.b("o", ctlu.a), ctiw.b("c", ctlu.a)));
        ctkyVar.b = "update_timestamp_us <> ?";
        ctkyVar.c = dcdc.f(Long.toString(0L));
        ctkyVar.d = 1 != i3 ? null : "update_timestamp_us DESC";
        i4.b(i2);
        i4.c();
        ctkyVar.e = dbslVar;
        return i4.a();
    }

    private static final Pair<String, String[]> aE(ContactId contactId) {
        return aB("contacts", contactId);
    }

    public static final Pair<String, String[]> al(cutf cutfVar) {
        String[] strArr;
        String a;
        String str = "lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =?";
        if (cutfVar.b() == ConversationId.IdType.ONE_TO_ONE) {
            ContactId c = cutfVar.c();
            if (c.c() == ContactId.ContactType.EMAIL) {
                a = cstg.a(c.a());
            } else {
                a = c.a();
            }
            strArr = new String[]{a, Integer.toString(ctjq.a.NV(c.c()).g), c.b()};
            if (c.d().a()) {
                strArr = (String[]) dclq.d(strArr, c.d().b());
                str = "lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =? AND lighter_handler_id =?";
            }
        } else {
            strArr = new String[]{cutfVar.a().a(), Integer.toString(ctjo.GROUP.g), cutfVar.a().b()};
        }
        return Pair.create(str, strArr);
    }

    private final void aw(final cugu cuguVar, final boolean z) {
        final ContentValues g = g(cuguVar);
        int o = cuguVar.o();
        if (o == 0) {
            throw null;
        }
        if (o == 1) {
            g.put("needs_delivery_receipt", (Boolean) true);
        } else {
            g.put("needs_delivery_receipt", (Boolean) false);
        }
        ctiv.a(this.g, new Runnable(this, cuguVar, z, g) { // from class: cthv
            private final ctim a;
            private final cugu b;
            private final boolean c;
            private final ContentValues d;

            {
                this.a = this;
                this.b = cuguVar;
                this.c = z;
                this.d = g;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
                if (r2 != null) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
                if (r2 != null) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
                if (r0.g.b(r0.ak("messages"), r3, 5) < 0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
                r0.ae(r1.a());
                r0.ad(r1.c());
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
                if (r5 == null) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
                if (r5.equals(r1.g()) != false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
                r13 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
                if (r0.d.contains(r1.g()) != false) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
                if (r13 == false) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
                if (r0.d.contains(r5) == false) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
                r12 = r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
                r0.ag(r1.c());
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
                if (r12 == false) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
                r0.af(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
                r0.af(r1.g());
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
                throw new android.database.sqlite.SQLiteException("Failed to save message.");
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r14 = this;
                    ctim r0 = r14.a
                    cugu r1 = r14.b
                    boolean r2 = r14.c
                    android.content.ContentValues r3 = r14.d
                    com.google.android.libraries.messaging.lighter.model.ConversationId r4 = r1.c()
                    if (r2 == 0) goto L17
                    java.lang.Long r2 = r1.d()
                    dbsg r2 = defpackage.dbsg.i(r2)
                    goto L19
                L17:
                    dbpy<java.lang.Object> r2 = defpackage.dbpy.a
                L19:
                    long r4 = r0.U(r4, r2)
                    java.lang.Long r2 = java.lang.Long.valueOf(r4)
                    java.lang.String r4 = "conversation_row_id"
                    r3.put(r4, r2)
                    com.google.android.libraries.messaging.lighter.model.ContactId r2 = r1.b()
                    long r4 = r0.X(r2)
                    java.lang.Long r2 = java.lang.Long.valueOf(r4)
                    java.lang.String r4 = "sender_contact_row_id"
                    r3.put(r4, r2)
                    java.lang.String r2 = r1.a()
                    ctir r4 = r0.g
                    java.lang.String r11 = "messages"
                    android.net.Uri r5 = r0.ak(r11)
                    r12 = 1
                    java.lang.String[] r6 = new java.lang.String[r12]
                    java.lang.String r7 = "message_status"
                    r13 = 0
                    r6[r13] = r7
                    java.lang.String[] r8 = new java.lang.String[r12]
                    r8[r13] = r2
                    r9 = 0
                    r10 = 0
                    java.lang.String r7 = "message_id = ?"
                    android.database.Cursor r2 = r4.a(r5, r6, r7, r8, r9, r10)
                    boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> Lcf
                    r5 = 0
                    if (r4 != 0) goto L64
                    if (r2 == 0) goto L6f
                L60:
                    r2.close()
                    goto L6f
                L64:
                    int r4 = r2.getInt(r13)     // Catch: java.lang.Throwable -> Lcf
                    cugo r5 = defpackage.cugo.a(r4)     // Catch: java.lang.Throwable -> Lcf
                    if (r2 == 0) goto L6f
                    goto L60
                L6f:
                    ctir r2 = r0.g
                    android.net.Uri r4 = r0.ak(r11)
                    r6 = 5
                    long r2 = r2.b(r4, r3, r6)
                    r6 = 0
                    int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                    if (r4 < 0) goto Lc7
                    java.lang.String r2 = r1.a()
                    r0.ae(r2)
                    com.google.android.libraries.messaging.lighter.model.ConversationId r2 = r1.c()
                    r0.ad(r2)
                    if (r5 == 0) goto L9b
                    cugo r2 = r1.g()
                    boolean r2 = r5.equals(r2)
                    if (r2 != 0) goto L9b
                    r13 = 1
                L9b:
                    dcdc<cugo> r2 = r0.d
                    cugo r3 = r1.g()
                    boolean r2 = r2.contains(r3)
                    if (r2 != 0) goto Lb2
                    if (r13 == 0) goto Lbf
                    dcdc<cugo> r2 = r0.d
                    boolean r2 = r2.contains(r5)
                    if (r2 == 0) goto Lbc
                    goto Lb3
                Lb2:
                    r12 = r13
                Lb3:
                    com.google.android.libraries.messaging.lighter.model.ConversationId r2 = r1.c()
                    r0.ag(r2)
                    if (r12 == 0) goto Lbf
                Lbc:
                    r0.af(r5)
                Lbf:
                    cugo r1 = r1.g()
                    r0.af(r1)
                    return
                Lc7:
                    android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
                    java.lang.String r1 = "Failed to save message."
                    r0.<init>(r1)
                    throw r0
                Lcf:
                    r0 = move-exception
                    if (r2 == 0) goto Lda
                    r2.close()     // Catch: java.lang.Throwable -> Ld6
                    goto Lda
                Ld6:
                    r1 = move-exception
                    defpackage.deki.a(r0, r1)
                Lda:
                    goto Ldc
                Ldb:
                    throw r0
                Ldc:
                    goto Ldb
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cthv.run():void");
            }
        });
    }

    private final long ax(final cufp cufpVar) {
        return ((Long) ctiv.b(this.g, new Callable(this, cufpVar) { // from class: cthx
            private final ctim a;
            private final cufp b;

            {
                this.a = this;
                this.b = cufpVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dbsg dbsgVar;
                ctim ctimVar = this.a;
                cufp cufpVar2 = this.b;
                long X = ctimVar.X(cufpVar2.a().a());
                if (cufpVar2.a().c() == ConversationId.IdType.ONE_TO_ONE) {
                    dbsgVar = dbsg.i(Long.valueOf(ctimVar.X(cufpVar2.a().e())));
                } else {
                    dbsgVar = dbpy.a;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("conversation_properties", ctjv.c(cufpVar2));
                contentValues.put("conversation_app_data", ctjv.d(dcjz.e(cufpVar2.i())));
                contentValues.put("conversation_type", Integer.valueOf(cufpVar2.a().c().c));
                if (cufpVar2.a().c() == ConversationId.IdType.GROUP) {
                    contentValues.put("conversation_group_id", cufpVar2.a().d().a());
                    contentValues.put("conversation_group_app_name", cufpVar2.a().d().b());
                }
                if (dbsgVar.a()) {
                    contentValues.put("other_contact_row_id", (Long) dbsgVar.b());
                }
                Long valueOf = Long.valueOf(X);
                contentValues.put("owner_row_id", valueOf);
                contentValues.put("update_timestamp_us", (Long) 0L);
                long b = ctimVar.g.b(ctimVar.ak("conversations"), contentValues, 0);
                ctimVar.Z();
                ArrayList arrayList = new ArrayList();
                arrayList.add(valueOf);
                if (dbsgVar.a()) {
                    arrayList.add((Long) dbsgVar.b());
                }
                ctimVar.N(cufpVar2.a(), b, arrayList);
                return Long.valueOf(b);
            }
        })).longValue();
    }

    private final synchronized cuss<?> ay(ctlp ctlpVar) {
        LruCache<ctlp, cuss<?>> lruCache = this.f;
        if (lruCache == null) {
            new cswd(new cswc(this) { // from class: ctia
                private final ctim a;

                {
                    this.a = this;
                }

                @Override // defpackage.cswc
                public final void a(Object obj) {
                    ctim ctimVar = this.a;
                    Integer num = (Integer) obj;
                    synchronized (ctimVar) {
                        if (ctimVar.f == null && num.intValue() > 0) {
                            ctimVar.f = new LruCache<>(num.intValue());
                        }
                    }
                }
            }, cswe.a(this.a).p).execute(new Void[0]);
            return null;
        }
        return lruCache.get(ctlpVar);
    }

    private final synchronized void az(final ctlp ctlpVar, final cuss<?> cussVar) {
        LruCache<ctlp, cuss<?>> lruCache = this.f;
        if (lruCache == null) {
            new cswd(new cswc(this, ctlpVar, cussVar) { // from class: ctib
                private final ctim a;
                private final ctlp b;
                private final cuss c;

                {
                    this.a = this;
                    this.b = ctlpVar;
                    this.c = cussVar;
                }

                @Override // defpackage.cswc
                public final void a(Object obj) {
                    ctim ctimVar = this.a;
                    ctlp ctlpVar2 = this.b;
                    cuss<?> cussVar2 = this.c;
                    Integer num = (Integer) obj;
                    synchronized (ctimVar) {
                        if (ctimVar.f == null && num.intValue() > 0) {
                            ctimVar.f = new LruCache<>(num.intValue());
                            ctimVar.f.put(ctlpVar2, cussVar2);
                        }
                    }
                }
            }, cswe.a(this.a).p).execute(new Void[0]);
        } else {
            lruCache.put(ctlpVar, cussVar);
        }
    }

    public static ContentValues g(cugu cuguVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", cuguVar.a());
        int o = cuguVar.o();
        int i2 = o - 1;
        if (o != 0) {
            contentValues.put("message_type", Integer.valueOf(i2));
            contentValues.put("message_status", Integer.valueOf(cuguVar.g().m));
            contentValues.put("server_timestamp_us", cuguVar.d());
            contentValues.put("capability", Integer.valueOf(cuguVar.j()));
            contentValues.put("rendering_type", Integer.valueOf(cuguVar.k().a().h));
            contentValues.put("filterable_flags", Integer.valueOf(cuguVar.m()));
            try {
                contentValues.put("message_properties", csto.a(ctkf.c(cuguVar)));
                return contentValues;
            } catch (IOException e) {
                cstl.a("SQLiteMessagingStore");
                throw new SQLiteException("Fali to serialize message profile", e);
            }
        }
        throw null;
    }

    @Override // defpackage.cusm
    public final void A(ConversationId conversationId, List<String> list, List<cugo> list2, cugo cugoVar) {
        if (list.isEmpty()) {
            return;
        }
        HashSet<cugo> hashSet = new HashSet(list2);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("message_status", Integer.valueOf(cugoVar.m));
        int size = (999 - hashSet.size()) - 1;
        int i2 = 0;
        while (i2 < list.size()) {
            int min = Math.min(i2 + size, list.size());
            List<String> subList = list.subList(i2, min);
            final String[] strArr = new String[subList.size() + hashSet.size()];
            String i3 = ctiw.i(subList.size());
            String i4 = ctiw.i(hashSet.size());
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 41 + String.valueOf(i4).length());
            sb.append("message_id IN (");
            sb.append(i3);
            sb.append(") AND ");
            sb.append("message_status");
            sb.append(" IN (");
            sb.append(i4);
            sb.append(")");
            final String sb2 = sb.toString();
            subList.toArray(strArr);
            int i5 = 0;
            for (cugo cugoVar2 : hashSet) {
                strArr[subList.size() + i5] = Integer.toString(cugoVar2.m);
                i5++;
            }
            ctiv.a(this.g, new Runnable(this, contentValues, sb2, strArr) { // from class: cthd
                private final ctim a;
                private final ContentValues b;
                private final String c;
                private final String[] d;

                {
                    this.a = this;
                    this.b = contentValues;
                    this.c = sb2;
                    this.d = strArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ctim ctimVar = this.a;
                    ctimVar.g.c(ctimVar.ak("messages"), this.b, this.c, this.d);
                }
            });
            i2 = min;
        }
        for (String str : list) {
            ae(str);
        }
        boolean contains = this.d.contains(cugoVar);
        for (cugo cugoVar3 : hashSet) {
            af(cugoVar3);
            contains = contains || this.d.contains(cugoVar3);
        }
        af(cugoVar);
        if (contains) {
            ag(conversationId);
        }
        ad(conversationId);
    }

    @Override // defpackage.cusm
    public final void B(final dcdc<cugu> dcdcVar) {
        if (dcdcVar.isEmpty()) {
            return;
        }
        dcdg p = dcdn.p();
        final HashSet hashSet = new HashSet();
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            cugu cuguVar = dcdcVar.get(i2);
            ContentValues contentValues = new ContentValues();
            try {
                byte[] a = csto.a(ctkf.c(cuguVar));
                contentValues.put("rendering_type", Integer.valueOf(cuguVar.k().a().h));
                contentValues.put("message_properties", a);
                contentValues.put("capability", Integer.valueOf(cuguVar.j()));
                p.f(cuguVar.a(), contentValues);
            } catch (IOException unused) {
                cstl.a("SQLiteMessagingStore");
            }
        }
        final dcdn b = p.b();
        ctiv.a(this.g, new Runnable(this, dcdcVar, b, hashSet) { // from class: cthe
            private final ctim a;
            private final dcdc b;
            private final dcdn c;
            private final Set d;

            {
                this.a = this;
                this.b = dcdcVar;
                this.c = b;
                this.d = hashSet;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                dcdc dcdcVar2 = this.b;
                dcdn dcdnVar = this.c;
                Set<ConversationId> set = this.d;
                int size2 = dcdcVar2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    cugu cuguVar2 = (cugu) dcdcVar2.get(i3);
                    ctimVar.g.c(ctimVar.ak("messages"), (ContentValues) dcdnVar.get(cuguVar2.a()), "message_id = ?", new String[]{cuguVar2.a()});
                    ctimVar.ae(cuguVar2.a());
                    set.add(cuguVar2.c());
                }
                for (ConversationId conversationId : set) {
                    ctimVar.ad(conversationId);
                }
            }
        });
    }

    @Override // defpackage.cusm
    public final dcdc<String> C(final ConversationId conversationId, final cugo cugoVar, final long j) {
        return (dcdc) ctiv.b(this.g, new Callable(this, conversationId, cugoVar, j) { // from class: cthf
            private final ctim a;
            private final ConversationId b;
            private final cugo c;
            private final long d;

            {
                this.a = this;
                this.b = conversationId;
                this.c = cugoVar;
                this.d = j;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r13 = this;
                    ctim r0 = r13.a
                    com.google.android.libraries.messaging.lighter.model.ConversationId r1 = r13.b
                    cugo r2 = r13.c
                    long r3 = r13.d
                    r5 = 3
                    java.lang.String[] r10 = new java.lang.String[r5]
                    long r5 = r0.D(r1)
                    java.lang.String r1 = java.lang.Long.toString(r5)
                    r5 = 0
                    r10[r5] = r1
                    int r1 = r2.m
                    java.lang.String r1 = java.lang.Integer.toString(r1)
                    r2 = 1
                    r10[r2] = r1
                    java.lang.String r1 = java.lang.Long.toString(r3)
                    r3 = 2
                    r10[r3] = r1
                    dccx r1 = defpackage.dcdc.F()
                    ctir r6 = r0.g
                    java.lang.String r3 = "messages"
                    android.net.Uri r7 = r0.ak(r3)
                    java.lang.String[] r8 = new java.lang.String[r2]
                    java.lang.String r0 = "message_id"
                    r8[r5] = r0
                    java.lang.String r9 = "conversation_row_id = ? AND message_status = ? AND server_timestamp_us > ?"
                    r11 = 0
                    r12 = 0
                    android.database.Cursor r0 = r6.a(r7, r8, r9, r10, r11, r12)
                    boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5d
                    if (r2 == 0) goto L53
                L46:
                    java.lang.String r2 = r0.getString(r5)     // Catch: java.lang.Throwable -> L5d
                    r1.g(r2)     // Catch: java.lang.Throwable -> L5d
                    boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L5d
                    if (r2 != 0) goto L46
                L53:
                    dcdc r1 = r1.f()     // Catch: java.lang.Throwable -> L5d
                    if (r0 == 0) goto L5c
                    r0.close()
                L5c:
                    return r1
                L5d:
                    r1 = move-exception
                    if (r0 == 0) goto L68
                    r0.close()     // Catch: java.lang.Throwable -> L64
                    goto L68
                L64:
                    r0 = move-exception
                    defpackage.deki.a(r1, r0)
                L68:
                    goto L6a
                L69:
                    throw r1
                L6a:
                    goto L69
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cthf.call():java.lang.Object");
            }
        });
    }

    public final long D(ConversationId conversationId) {
        String[] strArr;
        String str;
        if (conversationId.c() == ConversationId.IdType.GROUP) {
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
            strArr = new String[]{conversationId.d().a(), conversationId.d().b()};
        } else {
            long Y = Y(conversationId.e());
            if (Y == -1) {
                return -1L;
            }
            strArr = new String[]{String.valueOf(Y)};
            str = "other_contact_row_id = ?";
        }
        Cursor a = this.g.a(ak("conversations"), new String[]{"id"}, str, strArr, null, null);
        try {
            if (!a.moveToFirst()) {
                if (a != null) {
                    a.close();
                }
                return -1L;
            }
            long j = a.getLong(0);
            if (a != null) {
                a.close();
            }
            return j;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    public final dbsg<Long> E(String str) {
        return F(str, "server_timestamp_us");
    }

    public final dbsg<Long> F(String str, String str2) {
        Cursor a = this.g.a(ak("messages"), new String[]{str2}, "message_id = ?", new String[]{str}, null, null);
        try {
            if (!a.moveToFirst()) {
                dbpy<Object> dbpyVar = dbpy.a;
                if (a != null) {
                    a.close();
                }
                return dbpyVar;
            }
            dbsg<Long> i2 = dbsg.i(Long.valueOf(a.getLong(0)));
            if (a != null) {
                a.close();
            }
            return i2;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    public final dbsg<cufp> G(long j) {
        Cursor a = this.g.a(ak(aC()), ctiw.c(ctiw.b("conversations", ctlw.b), ctiw.b("o", ctlu.a), ctiw.b("c", ctlu.a)), "conversations.id = ?", new String[]{Long.toString(j)}, null, null);
        try {
            if (a.moveToFirst()) {
                dbsg<cufp> a2 = ctjv.a(a);
                if (a != null) {
                    a.close();
                }
                return a2;
            }
            cstl.a("SQLiteMessagingStore");
            if (a != null) {
                a.close();
            }
            return dbpy.a;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.cusm
    public final dcdn<ConversationId, dcdc<String>> H(long j) {
        final String[] strArr = {"1", Long.toString(j)};
        return (dcdn) ctiv.b(this.g, new Callable(this, strArr) { // from class: cthg
            private final ctim a;
            private final String[] b;

            {
                this.a = this;
                this.b = strArr;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[LOOP:3: B:26:0x00e3->B:28:0x00e9, LOOP_END] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r12 = this;
                    ctim r0 = r12.a
                    java.lang.String[] r5 = r12.b
                    java.util.HashMap r8 = new java.util.HashMap
                    r8.<init>()
                    java.util.HashMap r9 = new java.util.HashMap
                    r9.<init>()
                    ctir r1 = r0.g
                    java.lang.String r2 = "messages"
                    android.net.Uri r2 = r0.ak(r2)
                    r3 = 2
                    java.lang.String[] r3 = new java.lang.String[r3]
                    java.lang.String r4 = "message_id"
                    r10 = 0
                    r3[r10] = r4
                    java.lang.String r4 = "conversation_row_id"
                    r11 = 1
                    r3[r11] = r4
                    java.lang.String r4 = "needs_delivery_receipt = ? AND server_timestamp_us > ?"
                    r6 = 0
                    r7 = 0
                    android.database.Cursor r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L102
                    if (r2 == 0) goto L5a
                L31:
                    long r2 = r1.getLong(r11)     // Catch: java.lang.Throwable -> L102
                    java.lang.String r4 = r1.getString(r10)     // Catch: java.lang.Throwable -> L102
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L102
                    boolean r3 = r9.containsKey(r2)     // Catch: java.lang.Throwable -> L102
                    if (r3 != 0) goto L4b
                    java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L102
                    r3.<init>()     // Catch: java.lang.Throwable -> L102
                    r9.put(r2, r3)     // Catch: java.lang.Throwable -> L102
                L4b:
                    java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> L102
                    java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L102
                    r2.add(r4)     // Catch: java.lang.Throwable -> L102
                    boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L102
                    if (r2 != 0) goto L31
                L5a:
                    if (r1 == 0) goto L5f
                    r1.close()
                L5f:
                    java.util.Set r1 = r9.keySet()
                    java.util.Iterator r1 = r1.iterator()
                L67:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto Ld7
                    java.lang.Object r2 = r1.next()
                    java.lang.Long r2 = (java.lang.Long) r2
                    long r2 = r2.longValue()
                    dbsg r4 = r0.G(r2)
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    java.lang.Object r2 = r9.get(r2)
                    java.util.List r2 = (java.util.List) r2
                    java.util.Iterator r2 = r2.iterator()
                L89:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L67
                    java.lang.Object r3 = r2.next()
                    java.lang.String r3 = (java.lang.String) r3
                    boolean r5 = r4.a()
                    if (r5 == 0) goto Ld1
                    java.lang.Object r5 = r4.b()
                    cufp r5 = (defpackage.cufp) r5
                    com.google.android.libraries.messaging.lighter.model.ConversationId r5 = r5.a()
                    boolean r5 = r8.containsKey(r5)
                    if (r5 != 0) goto Lbd
                    java.lang.Object r5 = r4.b()
                    cufp r5 = (defpackage.cufp) r5
                    com.google.android.libraries.messaging.lighter.model.ConversationId r5 = r5.a()
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    r8.put(r5, r6)
                Lbd:
                    java.lang.Object r5 = r4.b()
                    cufp r5 = (defpackage.cufp) r5
                    com.google.android.libraries.messaging.lighter.model.ConversationId r5 = r5.a()
                    java.lang.Object r5 = r8.get(r5)
                    java.util.List r5 = (java.util.List) r5
                    r5.add(r3)
                    goto L89
                Ld1:
                    java.lang.String r3 = "SQLiteMessagingStore"
                    defpackage.cstl.a(r3)
                    goto L89
                Ld7:
                    dcdg r0 = defpackage.dcdn.p()
                    java.util.Set r1 = r8.keySet()
                    java.util.Iterator r1 = r1.iterator()
                Le3:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto Lfd
                    java.lang.Object r2 = r1.next()
                    com.google.android.libraries.messaging.lighter.model.ConversationId r2 = (com.google.android.libraries.messaging.lighter.model.ConversationId) r2
                    java.lang.Object r3 = r8.get(r2)
                    java.util.Collection r3 = (java.util.Collection) r3
                    dcdc r3 = defpackage.dcdc.r(r3)
                    r0.f(r2, r3)
                    goto Le3
                Lfd:
                    dcdn r0 = r0.b()
                    return r0
                L102:
                    r0 = move-exception
                    if (r1 == 0) goto L10d
                    r1.close()     // Catch: java.lang.Throwable -> L109
                    goto L10d
                L109:
                    r1 = move-exception
                    defpackage.deki.a(r0, r1)
                L10d:
                    goto L10f
                L10e:
                    throw r0
                L10f:
                    goto L10e
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cthg.call():java.lang.Object");
            }
        });
    }

    @Override // defpackage.cusm
    public final void I(List<String> list) {
        final ContentValues contentValues = new ContentValues();
        int i2 = 0;
        contentValues.put("needs_delivery_receipt", (Boolean) false);
        while (i2 < list.size()) {
            int min = Math.min(i2 + 998, list.size());
            List<String> subList = list.subList(i2, min);
            final String[] strArr = new String[subList.size()];
            String i3 = ctiw.i(subList.size());
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 16);
            sb.append("message_id IN (");
            sb.append(i3);
            sb.append(")");
            final String sb2 = sb.toString();
            subList.toArray(strArr);
            ctiv.a(this.g, new Runnable(this, contentValues, sb2, strArr) { // from class: cthh
                private final ctim a;
                private final ContentValues b;
                private final String c;
                private final String[] d;

                {
                    this.a = this;
                    this.b = contentValues;
                    this.c = sb2;
                    this.d = strArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ctim ctimVar = this.a;
                    ctimVar.g.c(ctimVar.ak("messages"), this.b, this.c, this.d);
                }
            });
            i2 = min;
        }
    }

    @Override // defpackage.cusm
    public final void J(final List<cutf> list) {
        ctiv.a(this.g, new Runnable(this, list) { // from class: cthj
            private final ctim a;
            private final List b;

            {
                this.a = this;
                this.b = list;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
                r2 = r2.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
                if (r2.hasNext() == false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
                r0.K((defpackage.cutf) r2.next(), true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
                r2 = r0.g.a(r0.ak("blocks"), defpackage.ctls.a, "id <= ?", new java.lang.String[]{java.lang.Long.toString(r5)}, null, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
                if (r2.moveToNext() == false) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
                if (defpackage.ctjo.a(r2.getInt(defpackage.ctlr.a(2))) != defpackage.ctjo.GROUP) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
                r3 = com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId.c();
                r3.c(r2.getString(defpackage.ctlr.a(3)));
                r3.b(r2.getString(defpackage.ctlr.a(5)));
                r3 = defpackage.cutd.a(r3.a());
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
                r4 = com.google.android.libraries.messaging.lighter.model.ContactId.f();
                r4.c(r2.getString(defpackage.ctlr.a(3)));
                r4.e(defpackage.ctjq.a.k().NV(defpackage.ctjo.a(r2.getInt(defpackage.ctlr.a(2)))));
                r4.d(r2.getString(defpackage.ctlr.a(5)));
                r3 = r2.getString(defpackage.ctlr.a(4));
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
                if (android.text.TextUtils.isEmpty(r3) != false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
                r4.b(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00ea, code lost:
                r3 = defpackage.cutd.b(r4.a());
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00f2, code lost:
                r0.K(r3, false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:
                if (r2 == null) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00fc, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00fd, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x010a, code lost:
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
                if (r3 != null) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
                if (r3 != null) goto L7;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 283
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cthj.run():void");
            }
        });
    }

    @Override // defpackage.cusm
    public final void K(final cutf cutfVar, final boolean z) {
        ctiv.a(this.g, new Runnable(this, z, cutfVar) { // from class: cthk
            private final ctim a;
            private final boolean b;
            private final cutf c;

            {
                this.a = this;
                this.b = z;
                this.c = cutfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String a;
                ctim ctimVar = this.a;
                boolean z2 = this.b;
                cutf cutfVar2 = this.c;
                if (z2) {
                    ctir ctirVar = ctimVar.g;
                    Uri ak = ctimVar.ak("blocks");
                    ContentValues contentValues = new ContentValues();
                    if (cutfVar2.b() == ConversationId.IdType.ONE_TO_ONE) {
                        ctjo NV = ctjq.a.NV(cutfVar2.c().c());
                        contentValues.put("lighter_id_id", cutfVar2.c().a());
                        if (NV == ctjo.EMAIL) {
                            a = cstg.a(cutfVar2.c().a());
                        } else {
                            a = cutfVar2.c().a();
                        }
                        contentValues.put("lighter_id_normalized_id", a);
                        contentValues.put("lighter_id_type", Integer.valueOf(NV.g));
                        contentValues.put("lighter_handler_id", cutfVar2.c().d().c(""));
                        contentValues.put("lighter_id_app_name", cutfVar2.c().b());
                    } else {
                        contentValues.put("lighter_id_type", Integer.toString(ctjo.GROUP.g));
                        contentValues.put("lighter_id_id", cutfVar2.a().a());
                        contentValues.put("lighter_id_normalized_id", cutfVar2.a().a());
                        contentValues.put("lighter_id_app_name", cutfVar2.a().b());
                        contentValues.put("lighter_handler_id", "");
                    }
                    if (ctirVar.b(ak, contentValues, 5) <= 0) {
                        return;
                    }
                    ctimVar.ab(cutfVar2);
                    return;
                }
                Pair<String, String[]> al = ctim.al(cutfVar2);
                if (ctimVar.g.d(ctimVar.ak("blocks"), (String) al.first, (String[]) al.second) <= 0) {
                    return;
                }
                ctimVar.ab(cutfVar2);
            }
        });
    }

    @Override // defpackage.cusm
    public final cuss<cuey> L(cutf cutfVar) {
        Pair<String, String[]> al = al(cutfVar);
        ctlo i2 = ctlp.i();
        i2.d(ak("blocks"));
        ctky ctkyVar = (ctky) i2;
        ctkyVar.a = dcdc.t(ctls.a);
        ctkyVar.b = (String) al.first;
        ctkyVar.c = dcdc.t((String[]) al.second);
        ctkyVar.d = null;
        return aj(i2.a(), this.a, cthm.a, ctln.e(this.c, cutfVar));
    }

    @Override // defpackage.cusm
    public final void M(final ConversationId conversationId, final List<ContactId> list) {
        ctiv.a(this.g, new Runnable(this, conversationId, list) { // from class: cthn
            private final ctim a;
            private final ConversationId b;
            private final List c;

            {
                this.a = this;
                this.b = conversationId;
                this.c = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                ConversationId conversationId2 = this.b;
                List<ContactId> list2 = this.c;
                long D = ctimVar.D(conversationId2);
                if (D == -1) {
                    cstl.a("SQLiteMessagingStore");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (ContactId contactId : list2) {
                    arrayList.add(Long.valueOf(ctimVar.X(contactId)));
                }
                ctimVar.N(conversationId2, D, arrayList);
            }
        });
    }

    public final void N(final ConversationId conversationId, final long j, final List<Long> list) {
        ctiv.a(this.g, new Runnable(this, list, j, conversationId) { // from class: ctho
            private final ctim a;
            private final List b;
            private final long c;
            private final ConversationId d;

            {
                this.a = this;
                this.b = list;
                this.c = j;
                this.d = conversationId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                List<Long> list2 = this.b;
                long j2 = this.c;
                ConversationId conversationId2 = this.d;
                for (Long l : list2) {
                    long longValue = l.longValue();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("conversation_row_id", Long.valueOf(j2));
                    contentValues.put("contact_row_id", Long.valueOf(longValue));
                    ctimVar.g.b(ctimVar.ak("participants"), contentValues, 5);
                }
                ctimVar.ac(conversationId2);
            }
        });
    }

    @Override // defpackage.cusm
    public final void O(final ConversationId conversationId, final List<ContactId> list) {
        ctiv.a(this.g, new Runnable(this, conversationId, list) { // from class: cthp
            private final ctim a;
            private final ConversationId b;
            private final List c;

            {
                this.a = this;
                this.b = conversationId;
                this.c = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ctim ctimVar = this.a;
                final ConversationId conversationId2 = this.b;
                List<ContactId> list2 = this.c;
                final long D = ctimVar.D(conversationId2);
                if (D == -1) {
                    cstl.a("SQLiteMessagingStore");
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                for (ContactId contactId : list2) {
                    long Y = ctimVar.Y(contactId);
                    if (Y != -1) {
                        arrayList.add(Long.valueOf(Y));
                    }
                }
                ctiv.a(ctimVar.g, new Runnable(ctimVar, arrayList, D, conversationId2) { // from class: cthq
                    private final ctim a;
                    private final List b;
                    private final long c;
                    private final ConversationId d;

                    {
                        this.a = ctimVar;
                        this.b = arrayList;
                        this.c = D;
                        this.d = conversationId2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ctim ctimVar2 = this.a;
                        List<Long> list3 = this.b;
                        long j = this.c;
                        ConversationId conversationId3 = this.d;
                        for (Long l : list3) {
                            long longValue = l.longValue();
                            if (ctimVar2.g.d(ctimVar2.ak("participants"), "conversation_row_id =? AND contact_row_id =?", new String[]{Long.toString(j), Long.toString(longValue)}) < 0) {
                                StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                                sb.append("Failed to kick participant,  Contact Row ID: ");
                                sb.append(longValue);
                                sb.append(" from Conversation Row ID: ");
                                sb.append(j);
                                sb.toString();
                                cstl.a("SQLiteMessagingStore");
                            }
                        }
                        ctimVar2.ac(conversationId3);
                    }
                });
            }
        });
    }

    @Override // defpackage.cusm
    public final void P(final Notification notification) {
        if (!cswe.a(this.a).z.f().booleanValue()) {
            return;
        }
        ctiv.a(this.g, new Runnable(this, notification) { // from class: cths
            private final ctim a;
            private final Notification b;

            {
                this.a = this;
                this.b = notification;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                Notification notification2 = this.b;
                ctir ctirVar = ctimVar.g;
                Uri ak = ctimVar.ak("notifications");
                HashMap hashMap = new HashMap();
                Notification.NotificationType notificationType = Notification.NotificationType.a;
                if (notification2.e().ordinal() == 0) {
                    MessageReceivedNotification f = notification2.f();
                    HashMap hashMap2 = new HashMap();
                    ConversationId a = f.a();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("OWNER", ctju.a(a.a()));
                    hashMap3.put("TYPE", Integer.valueOf(a.c().c));
                    int ordinal = a.c().ordinal();
                    if (ordinal == 0) {
                        hashMap3.put("OTHER_PARTICIPANT", ctju.a(a.e()));
                    } else if (ordinal == 1) {
                        hashMap3.put("GROUP", ctka.a(a.d()));
                    }
                    hashMap2.put("CONVERSATION_ID", hashMap3);
                    hashMap2.put("MESSAGE_ID", f.b());
                    hashMap2.put("SENDER_ID", ctju.a(f.c()));
                    hashMap2.put("AVATAR_URL", f.d());
                    hashMap2.put("TITLE", f.e());
                    hashMap2.put("BODY", f.f());
                    hashMap2.put("SENDER_NAME", f.g());
                    hashMap2.put("MESSAGE_CONTENT", f.h());
                    hashMap2.put("DISABLE_INLINE_RESPONSE", Boolean.valueOf(f.i()));
                    hashMap.put("message_received_notification", hashMap2);
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("notification_id", notification2.a());
                contentValues.put("notification_type", Integer.valueOf(notification2.e().b));
                contentValues.put("notification_timestamp_received_ms", notification2.b());
                try {
                    contentValues.put("notification_metadata", csto.a(new HashMap(notification2.c().a)));
                    contentValues.put("notification_properties", csto.a(hashMap));
                } catch (IOException unused) {
                    cstl.a("NotificationCursors");
                    contentValues = null;
                }
                if (ctirVar.b(ak, contentValues, 5) < 0) {
                    throw new SQLiteException("Failed to save notification.");
                }
                ctimVar.ai();
            }
        });
    }

    @Override // defpackage.cusm
    public final void Q(final dcdc<String> dcdcVar) {
        if (!cswe.a(this.a).z.f().booleanValue()) {
            return;
        }
        ctiv.a(this.g, new Runnable(this, dcdcVar) { // from class: ctht
            private final ctim a;
            private final dcdc b;

            {
                this.a = this;
                this.b = dcdcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                dcdc dcdcVar2 = this.b;
                String join = TextUtils.join(",", Collections.nCopies(dcdcVar2.size(), "?"));
                StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 21);
                sb.append("notification_id IN (");
                sb.append(join);
                sb.append(")");
                if (ctimVar.g.d(ctimVar.ak("notifications"), sb.toString(), (String[]) dcdcVar2.toArray(new String[dcdcVar2.size()])) > 0) {
                    ctimVar.ai();
                }
            }
        });
    }

    @Override // defpackage.cusm
    public final long R(ConversationId conversationId) {
        String valueOf = String.valueOf(D(conversationId));
        String join = TextUtils.join(", ", new Integer[]{Integer.valueOf(cugo.OUTGOING_PENDING_SEND.m), Integer.valueOf(cugo.OUTGOING_SENDING.m), Integer.valueOf(cugo.OUTGOING_FAILED_SEND.m), Integer.valueOf(cugo.LOCAL.m)});
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 53);
        sb.append("conversation_row_id = ?  AND message_status NOT IN (");
        sb.append(join);
        sb.append(")");
        Cursor a = this.g.a(ak("messages"), new String[]{"server_timestamp_us"}, sb.toString(), new String[]{valueOf}, "id DESC", "1");
        try {
            if (!a.moveToFirst()) {
                if (a == null) {
                    return 0L;
                }
                a.close();
                return 0L;
            }
            long j = a.getLong(0);
            if (a != null) {
                a.close();
            }
            return j;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.cusm
    public final long S() {
        String join = TextUtils.join(", ", cugo.o);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 24);
        sb.append("message_status NOT IN (");
        sb.append(join);
        sb.append(")");
        Cursor a = this.g.a(ak("messages"), new String[]{"server_timestamp_us"}, sb.toString(), new String[0], "server_timestamp_us DESC", "1");
        try {
            if (!a.moveToFirst()) {
                if (a == null) {
                    return 0L;
                }
                a.close();
                return 0L;
            }
            long j = a.getLong(0);
            if (a != null) {
                a.close();
            }
            return j;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.cusm
    public final void T() {
        try {
            final SQLiteDatabase writableDatabase = this.j.getWritableDatabase();
            writableDatabase.setForeignKeyConstraintsEnabled(false);
            final Runnable runnable = new Runnable(writableDatabase) { // from class: cthw
                private final SQLiteDatabase a;

                {
                    this.a = writableDatabase;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SQLiteDatabase sQLiteDatabase = this.a;
                    int i2 = ctim.h;
                    ctiw.d(sQLiteDatabase);
                }
            };
            Callable callable = new Callable(runnable) { // from class: ctit
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.run();
                    return null;
                }
            };
            cstq.a();
            writableDatabase.beginTransaction();
            try {
                try {
                    callable.call();
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    writableDatabase.setForeignKeyConstraintsEnabled(true);
                } catch (Exception e) {
                    throw new ctis(e);
                }
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLiteException unused) {
            cstl.a("SQLiteMessagingStore");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long U(ConversationId conversationId, dbsg<Long> dbsgVar) {
        long D = D(conversationId);
        if (D == -1) {
            cufo o = cufp.o();
            o.e(conversationId);
            o.f(-1L);
            o.b(new HashMap());
            o.c(conversationId.c() == ConversationId.IdType.ONE_TO_ONE);
            D = ax(o.a());
        }
        if (dbsgVar.a()) {
            W(D, dbsgVar.b());
        }
        return D;
    }

    public final long V(final cufj cufjVar) {
        final ContentValues c = ctjt.c(cufjVar);
        return ((Long) ctiv.b(this.g, new Callable(this, c, cufjVar) { // from class: cthy
            private final ctim a;
            private final ContentValues b;
            private final cufj c;

            {
                this.a = this;
                this.b = c;
                this.c = cufjVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                ContentValues contentValues = this.b;
                cufj cufjVar2 = this.c;
                long b = ctimVar.g.b(ctimVar.ak("contacts"), contentValues, 0);
                if (b < 0) {
                    throw new SQLiteException("Failed to save contact.");
                }
                ctimVar.ah(cufjVar2.a());
                return Long.valueOf(b);
            }
        })).longValue();
    }

    public final void W(long j, Long l) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("update_timestamp_us", l);
        if (this.g.c(ak("conversations"), contentValues, "id = ?", new String[]{String.valueOf(j)}) < 0) {
            throw new SQLiteException("Failed to update conversation.");
        }
        Z();
    }

    public final long X(final ContactId contactId) {
        return ((Long) ctiv.b(this.g, new Callable(this, contactId) { // from class: cthz
            private final ctim a;
            private final ContactId b;

            {
                this.a = this;
                this.b = contactId;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                ContactId contactId2 = this.b;
                long Y = ctimVar.Y(contactId2);
                if (Y == -1) {
                    cufi n = cufj.n();
                    n.c(contactId2);
                    n.e(-1L);
                    n.j(dcdc.e());
                    Y = ctimVar.V(n.a());
                }
                return Long.valueOf(Y);
            }
        })).longValue();
    }

    public final long Y(ContactId contactId) {
        Pair<String, String[]> aE = aE(contactId);
        Cursor a = this.g.a(ak("contacts"), new String[]{"id"}, (String) aE.first, (String[]) aE.second, null, null);
        try {
            if (!a.moveToFirst()) {
                if (a == null) {
                    return -1L;
                }
                a.close();
                return -1L;
            }
            long j = a.getLong(0);
            if (a != null) {
                a.close();
            }
            return j;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    public final void Z() {
        ctlq.a().c(ctln.d(this.c));
    }

    @Override // defpackage.cusm
    public final boolean a(final String str) {
        return ((Boolean) ctiv.b(this.g, new Callable(this, str) { // from class: ctgf
            private final ctim a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                String str2 = this.b;
                ctir ctirVar = ctimVar.g;
                Uri ak = ctimVar.ak("messages");
                boolean z = true;
                Cursor a = ctirVar.a(ak, new String[]{"id"}, "message_id = ?", new String[]{str2}, null, null);
                try {
                    if (a.getCount() == 0) {
                        z = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    if (a != null) {
                        a.close();
                    }
                    return valueOf;
                } catch (Throwable th) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
        })).booleanValue();
    }

    public final void aa(ConversationId conversationId) {
        ctlq.a().c(ctln.f(this.c, conversationId));
    }

    public final void ab(cutf cutfVar) {
        ctlq.a().c(ctln.e(this.c, cutfVar));
    }

    public final void ac(ConversationId conversationId) {
        ctlq.a().c(ctln.b(this.c, conversationId));
    }

    public final void ad(ConversationId conversationId) {
        ctlq.a().c(ctln.a(this.c, conversationId));
    }

    public final void ae(String str) {
        ctlq.a().c(ctln.j(this.c, str));
    }

    public final void af(cugo cugoVar) {
        ctlq.a().c(ctln.i(this.c, cugoVar));
    }

    public final void ag(ConversationId conversationId) {
        ctlq.a().c(ctln.h(this.c, conversationId));
    }

    public final void ah(ContactId contactId) {
        ctlq.a().c(ctln.g(this.c, contactId));
    }

    public final void ai() {
        ctlq.a().c(ctln.c(this.c));
    }

    public final <T> cuss<T> aj(final ctlp ctlpVar, final Context context, final dbrn<Cursor, T> dbrnVar, final Uri uri) {
        return aA(ctlpVar, new Callable(this, context, dbrnVar, uri, ctlpVar) { // from class: ctic
            private final ctim a;
            private final Context b;
            private final dbrn c;
            private final Uri d;
            private final ctlp e;

            {
                this.a = this;
                this.b = context;
                this.c = dbrnVar;
                this.d = uri;
                this.e = ctlpVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ctim ctimVar = this.a;
                final Context context2 = this.b;
                final dbrn dbrnVar2 = this.c;
                final Uri uri2 = this.d;
                final ctlp ctlpVar2 = this.e;
                return new cusd(cswe.b(cswe.a(ctimVar.a).q, ctimVar.e), new dbrn(ctimVar, context2, dbrnVar2, uri2, ctlpVar2) { // from class: ctid
                    private final ctim a;
                    private final Context b;
                    private final dbrn c;
                    private final Uri d;
                    private final ctlp e;

                    {
                        this.a = ctimVar;
                        this.b = context2;
                        this.c = dbrnVar2;
                        this.d = uri2;
                        this.e = ctlpVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        ctim ctimVar2 = this.a;
                        Context context3 = this.b;
                        dbrn dbrnVar3 = this.c;
                        Uri uri3 = this.d;
                        ctlp ctlpVar3 = this.e;
                        if (((Boolean) obj).booleanValue()) {
                            return new ctlm(context3, dbrnVar3, ctimVar2.g, uri3, ctlpVar3);
                        }
                        return new ctlg(context3, dbrnVar3, ctimVar2.g, uri3, ctlpVar3);
                    }
                }, ctimVar.e);
            }
        });
    }

    public final Uri ak(String str) {
        return ctiw.f(String.valueOf(this.a.getPackageName()).concat(".lighter.data"), "MESSAGING", str, Long.toString(this.c));
    }

    @Override // defpackage.cusm
    public final cuss<Pair<dcdc<cufw>, Boolean>> am(int i2, int i3, dbsl<cufw> dbslVar) {
        final ctlp aD = aD(ctlw.a, i2, i3, dbslVar);
        return aA(aD, new Callable(this, aD) { // from class: ctgi
            private final ctim a;
            private final ctlp b;

            {
                this.a = this;
                this.b = aD;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                return new ctlj(ctimVar.a, ctih.a, ctimVar.g, ctln.d(ctimVar.c), this.b);
            }
        });
    }

    @Override // defpackage.cusm
    public final cuss<dcdc<cufp>> an(int i2, int i3) {
        return aj(aD(ctlw.b, i2, i3, null), this.a, new dbrn(this) { // from class: ctgg
            private final ctim a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.m((Cursor) obj);
            }
        }, ctln.d(this.c));
    }

    @Override // defpackage.cusm
    public final cuss<Pair<dcdc<cufp>, Boolean>> ao(dbsl<cufp> dbslVar) {
        final ctlp aD = aD(ctlw.b, 3, 0, dbslVar);
        return aA(aD, new Callable(this, aD) { // from class: ctgh
            private final ctim a;
            private final ctlp b;

            {
                this.a = this;
                this.b = aD;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ctim ctimVar = this.a;
                return new ctlj(ctimVar.a, new dbrn(ctimVar) { // from class: ctii
                    private final ctim a;

                    {
                        this.a = ctimVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        return this.a.m((Cursor) obj);
                    }
                }, ctimVar.g, ctln.d(ctimVar.c), this.b);
            }
        });
    }

    @Override // defpackage.cusm
    public final cuss<dcdc<cufj>> ap(ConversationId conversationId) {
        String sb;
        String[] b;
        String[] strArr;
        String str;
        if (conversationId.c() == ConversationId.IdType.ONE_TO_ONE) {
            String a = ctiw.a("c", "id");
            String a2 = ctiw.a("conversations", "id");
            String a3 = ctiw.a("o", "id");
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 166 + String.valueOf(a2).length() + 1 + String.valueOf(a3).length());
            sb2.append("(((participants INNER JOIN contacts AS ");
            sb2.append("c");
            sb2.append(" ON ");
            sb2.append("contact_row_id");
            sb2.append(" = ");
            sb2.append(a);
            sb2.append(") INNER JOIN ");
            sb2.append("conversations");
            sb2.append(" ON ");
            sb2.append("conversation_row_id");
            sb2.append(" = ");
            sb2.append(a2);
            sb2.append(") INNER JOIN ");
            sb2.append("contacts");
            sb2.append(" AS ");
            sb2.append("o");
            sb2.append(" ON ");
            sb2.append("other_contact_row_id");
            sb2.append(" = ");
            sb2.append(a3);
            sb2.append(")");
            sb = sb2.toString();
            b = ctiw.b("c", ctlu.a);
            Pair<String, String[]> aB = aB("o", conversationId.e());
            str = (String) aB.first;
            strArr = (String[]) aB.second;
        } else {
            String a4 = ctiw.a("conversations", "id");
            String a5 = ctiw.a("contacts", "id");
            StringBuilder sb3 = new StringBuilder(String.valueOf(a4).length() + R.styleable.AppCompatTheme_textAppearanceSearchResultTitle + String.valueOf(a5).length());
            sb3.append("((participants INNER JOIN conversations ON conversation_row_id = ");
            sb3.append(a4);
            sb3.append(") INNER JOIN ");
            sb3.append("contacts");
            sb3.append(" ON ");
            sb3.append("contact_row_id");
            sb3.append(" = ");
            sb3.append(a5);
            sb3.append(")");
            sb = sb3.toString();
            b = ctiw.b("contacts", ctlu.a);
            strArr = new String[]{conversationId.d().a(), conversationId.d().b()};
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
        }
        ctlo i2 = ctlp.i();
        i2.d(ak(sb));
        ctky ctkyVar = (ctky) i2;
        ctkyVar.a = dcdc.t(b);
        ctkyVar.b = str;
        ctkyVar.c = dcdc.t(strArr);
        ctkyVar.d = null;
        return aj(i2.a(), this.a, cthr.a, ctln.b(this.c, conversationId));
    }

    @Override // defpackage.cusm
    public final cuss<Integer> aq(ConversationId conversationId) {
        String sb;
        String[] strArr;
        String str = i;
        String i2 = ctiw.i(this.d.size());
        StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 20);
        sb2.append("message_status IN (");
        sb2.append(i2);
        sb2.append(")");
        String sb3 = sb2.toString();
        if (conversationId.c() == ConversationId.IdType.GROUP) {
            String valueOf = String.valueOf(sb3);
            int i3 = cugt.TOMBSTONE.h;
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 98);
            sb4.append(valueOf);
            sb4.append(" AND conversation_group_id =? AND conversation_group_app_name =? AND rendering_type <> ");
            sb4.append(i3);
            sb = sb4.toString();
            strArr = (String[]) dclq.b(o(), new String[]{conversationId.d().a(), conversationId.d().b()}, String.class);
        } else {
            Pair<String, String[]> aE = aE(conversationId.e());
            String valueOf2 = String.valueOf(str);
            String a = ctiw.a("contacts", "id");
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 47 + String.valueOf(a).length());
            sb5.append(valueOf2);
            sb5.append(" INNER JOIN contacts ON other_contact_row_id = ");
            sb5.append(a);
            str = sb5.toString();
            String valueOf3 = String.valueOf(sb3);
            String str2 = (String) aE.first;
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 5 + String.valueOf(str2).length());
            sb6.append(valueOf3);
            sb6.append(" AND ");
            sb6.append(str2);
            sb = sb6.toString();
            strArr = (String[]) dclq.b(o(), (String[]) aE.second, String.class);
        }
        ctlo i4 = ctlp.i();
        i4.d(ak(str));
        ctky ctkyVar = (ctky) i4;
        ctkyVar.a = dcdc.f(ctiw.a("messages", "id"));
        ctkyVar.b = sb;
        ctkyVar.c = dcdc.t(strArr);
        ctkyVar.d = null;
        return aj(i4.a(), this.a, ctgj.a, ctln.h(this.c, conversationId));
    }

    @Override // defpackage.cusm
    public final void ar(final cufj cufjVar) {
        Long l = (Long) ctiv.b(this.g, new Callable(this, cufjVar) { // from class: ctgx
            private final ctim a;
            private final cufj b;

            {
                this.a = this;
                this.b = cufjVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                cufj cufjVar2 = this.b;
                long Y = ctimVar.Y(cufjVar2.a());
                if (Y == -1) {
                    return Long.valueOf(ctimVar.V(cufjVar2));
                }
                if (ctimVar.g.c(ctimVar.ak("contacts"), ctjt.c(cufjVar2), "id = ?", new String[]{String.valueOf(Y)}) < 0) {
                    throw new SQLiteException("Failed to update contact.");
                }
                ctimVar.ah(cufjVar2.a());
                return Long.valueOf(Y);
            }
        });
    }

    @Override // defpackage.cusm
    public final void as(final cufp cufpVar) {
        Long l = (Long) ctiv.b(this.g, new Callable(this, cufpVar) { // from class: ctgs
            private final ctim a;
            private final cufp b;

            {
                this.a = this;
                this.b = cufpVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(this.a.s(this.b, false));
            }
        });
    }

    @Override // defpackage.cusm
    public final void at(final cufp cufpVar) {
        Long l = (Long) ctiv.b(this.g, new Callable(this, cufpVar) { // from class: ctgt
            private final ctim a;
            private final cufp b;

            {
                this.a = this;
                this.b = cufpVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(this.a.s(this.b, true));
            }
        });
    }

    @Override // defpackage.cusm
    public final void au(final ConversationId conversationId, final long j, final long j2) {
        dcdc dcdcVar = (dcdc) ctiv.b(this.g, new Callable(this, conversationId, j2, j) { // from class: cthi
            private final ctim a;
            private final ConversationId b;
            private final long c;
            private final long d;

            {
                this.a = this;
                this.b = conversationId;
                this.c = j2;
                this.d = j;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dccx dccxVar;
                String str = "messages";
                ctim ctimVar = this.a;
                ConversationId conversationId2 = this.b;
                long j3 = this.c;
                long j4 = this.d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_status", Integer.valueOf(cugo.OUTGOING_FAILED_SEND.m));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cstd.a();
                String[] strArr = {Long.toString(ctimVar.D(conversationId2)), Integer.toString(cugo.OUTGOING_SENDING.m), Long.toString(timeUnit.toMicros((System.currentTimeMillis() + j3) - j4))};
                dccx F = dcdc.F();
                ctir ctirVar = ctimVar.g;
                String valueOf = String.valueOf(ctiw.a("contacts", "id"));
                dccx dccxVar2 = F;
                Cursor a = ctirVar.a(ctimVar.ak(valueOf.length() != 0 ? "messages INNER JOIN contacts ON sender_contact_row_id = ".concat(valueOf) : new String("messages INNER JOIN contacts ON sender_contact_row_id = ")), null, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us < ?", strArr, null, null);
                try {
                    if (a.moveToFirst()) {
                        ctimVar.g.c(ctimVar.ak(str), contentValues, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us < ?", strArr);
                        dcdc<ctjz<cugu>> b = ctkf.b(conversationId2, a);
                        dcpe listIterator = ctjz.e(b).listIterator();
                        while (listIterator.hasNext()) {
                            cugu cuguVar = (cugu) listIterator.next();
                            dccx dccxVar3 = dccxVar2;
                            dccxVar3.g(cuguVar.a());
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("server_timestamp_us", Long.valueOf((cuguVar.d().longValue() - TimeUnit.MILLISECONDS.toMicros(j3)) + TimeUnit.MILLISECONDS.toMicros(j4)));
                            ctimVar.g.c(ctimVar.ak(str), contentValues2, "message_id = ?", new String[]{cuguVar.a()});
                            ctimVar.ae(cuguVar.a());
                            dccxVar2 = dccxVar3;
                            str = str;
                        }
                        dccxVar = dccxVar2;
                        ctimVar.ad(conversationId2);
                        ctimVar.af(cugo.OUTGOING_SENDING);
                        ctimVar.af(cugo.OUTGOING_FAILED_SEND);
                        dcpe<ctxn> listIterator2 = ctjz.d(b).listIterator();
                        while (listIterator2.hasNext()) {
                            ctimVar.b.b(listIterator2.next());
                        }
                    } else {
                        dccxVar = dccxVar2;
                    }
                    dcdc f = dccxVar.f();
                    if (a != null) {
                        a.close();
                    }
                    return f;
                } catch (Throwable th) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.cusm
    public final cuss<dcdc<Notification>> av() {
        if (!cswe.a(this.a).z.f().booleanValue()) {
            return new cusy();
        }
        ctlo i2 = ctlp.i();
        i2.d(ak("notifications"));
        ctky ctkyVar = (ctky) i2;
        ctkyVar.a = dcdc.t(ctmb.a);
        ctkyVar.b = null;
        ctkyVar.c = null;
        ctkyVar.d = "notification_timestamp_received_ms DESC";
        i2.b(-1);
        return aj(i2.a(), this.a, cthu.a, ctln.c(this.c));
    }

    @Override // defpackage.cusm
    public final boolean b(final String str, final cugo cugoVar) {
        return ((Boolean) ctiv.b(this.g, new Callable(this, str, cugoVar) { // from class: ctgp
            private final ctim a;
            private final String b;
            private final cugo c;

            {
                this.a = this;
                this.b = str;
                this.c = cugoVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                String str2 = this.b;
                cugo cugoVar2 = this.c;
                ctir ctirVar = ctimVar.g;
                Uri ak = ctimVar.ak("messages");
                boolean z = true;
                Cursor a = ctirVar.a(ak, new String[]{"id"}, "message_id = ? AND message_status = ?", new String[]{str2, String.valueOf(cugoVar2.m)}, null, null);
                try {
                    if (a.getCount() == 0) {
                        z = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    if (a != null) {
                        a.close();
                    }
                    return valueOf;
                } catch (Throwable th) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
        })).booleanValue();
    }

    @Override // defpackage.cusm
    public final boolean c(final ConversationId conversationId, final dcdc<Integer> dcdcVar, final long j) {
        return ((Boolean) ctiv.b(this.g, new Callable(this, conversationId, dcdcVar, j) { // from class: ctha
            private final ctim a;
            private final ConversationId b;
            private final dcdc c;
            private final long d;

            {
                this.a = this;
                this.b = conversationId;
                this.c = dcdcVar;
                this.d = j;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                ConversationId conversationId2 = this.b;
                dcdc<Integer> dcdcVar2 = this.c;
                long j2 = this.d;
                long D = ctimVar.D(conversationId2);
                if (D == -1) {
                    D = ctimVar.U(conversationId2, dbpy.a);
                    if (D == -1) {
                        return false;
                    }
                }
                dbsg<cufp> G = ctimVar.G(D);
                if (G.a()) {
                    cufo n = G.b().n();
                    n.d(dcdcVar2);
                    n.j(Long.valueOf(j2));
                    cufp a = n.a();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("conversation_properties", ctjv.c(a));
                    if (ctimVar.g.c(ctimVar.ak("conversations"), contentValues, "id = ?", new String[]{String.valueOf(D)}) < 0) {
                        cstl.a("SQLiteMessagingStore");
                        return false;
                    }
                    ctimVar.aa(G.b().a());
                    return true;
                }
                return false;
            }
        })).booleanValue();
    }

    @Override // defpackage.cusm
    public final Pair<Boolean, Boolean> d(final cuib cuibVar) {
        return (Pair) ctiv.b(this.g, new Callable(this, cuibVar) { // from class: cthl
            private final ctim a;
            private final cuib b;

            {
                this.a = this;
                this.b = cuibVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                cuib cuibVar2 = this.b;
                String b = cuibVar2.b();
                dbsg<Long> E = ctimVar.E(b);
                if (E.a()) {
                    dbsg<Long> F = ctimVar.F(b, "conversation_row_id");
                    if (!F.a()) {
                        cstl.a("SQLiteMessagingStore");
                        return Pair.create(false, true);
                    }
                    dbsg<cufp> G = ctimVar.G(F.b().longValue());
                    if (!G.a()) {
                        cstl.a("SQLiteMessagingStore");
                        return Pair.create(false, true);
                    }
                    cufp b2 = G.b();
                    if (b2.j().a()) {
                        dbsg<Long> E2 = ctimVar.E(b2.j().b().b());
                        if (E2.a() && E.b().longValue() < E2.b().longValue()) {
                            return Pair.create(false, true);
                        }
                    }
                    cufo n = b2.n();
                    n.l(dbsg.i(cuibVar2));
                    cufp a = n.a();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("conversation_properties", ctjv.c(a));
                    if (ctimVar.g.c(ctimVar.ak("conversations"), contentValues, "id = ?", new String[]{String.valueOf(F.b())}) < 0) {
                        cstl.a("SQLiteMessagingStore");
                        return Pair.create(false, true);
                    }
                    ctimVar.aa(b2.a());
                    return Pair.create(true, true);
                }
                cstl.a("SQLiteMessagingStore");
                return Pair.create(false, false);
            }
        });
    }

    @Override // defpackage.cusm
    public final void e(cugu cuguVar) {
        aw(cuguVar, false);
    }

    @Override // defpackage.cusm
    public final void f(cugu cuguVar) {
        aw(cuguVar, true);
    }

    @Override // defpackage.cusm
    public final void h(final ConversationId conversationId, final cufh... cufhVarArr) {
        ctiv.a(this.g, new Runnable(this, conversationId, cufhVarArr) { // from class: ctig
            private final ctim a;
            private final ConversationId b;
            private final cufh[] c;

            {
                this.a = this;
                this.b = conversationId;
                this.c = cufhVarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                ConversationId conversationId2 = this.b;
                cufh[] cufhVarArr2 = this.c;
                long U = ctimVar.U(conversationId2, dbpy.a);
                int length = cufhVarArr2.length;
                boolean z = false;
                int i2 = 0;
                boolean z2 = false;
                long j = 0;
                while (i2 < length) {
                    cufh cufhVar = cufhVarArr2[i2];
                    cugu a = cufhVar.a();
                    if (j < a.d().longValue()) {
                        j = a.d().longValue();
                    }
                    ContentValues g = ctim.g(a);
                    g.put("needs_delivery_receipt", cufhVar.c().c(Boolean.valueOf(z)));
                    g.put("conversation_row_id", Long.valueOf(U));
                    g.put("sender_contact_row_id", Long.valueOf(ctimVar.X(a.b())));
                    if (ctimVar.g.b(ctimVar.ak("messages"), g, 5) >= 0) {
                        ctimVar.ae(a.a());
                        ctimVar.ad(a.c());
                        z2 |= ctimVar.d.contains(a.g());
                        i2++;
                        z = false;
                    } else {
                        throw new SQLiteException("Failed to save message.");
                    }
                }
                if (z2) {
                    ctimVar.ag(conversationId2);
                }
                ctimVar.U(conversationId2, dbsg.i(Long.valueOf(j)));
            }
        });
    }

    @Override // defpackage.cusm
    public final void i(final ConversationId conversationId, final String... strArr) {
        String join = TextUtils.join(", ", Collections.nCopies(strArr.length, '?'));
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 16);
        sb.append("message_id IN (");
        sb.append(join);
        sb.append(")");
        final String sb2 = sb.toString();
        ctiv.a(this.g, new Runnable(this, sb2, strArr, conversationId) { // from class: ctij
            private final ctim a;
            private final String b;
            private final String[] c;
            private final ConversationId d;

            {
                this.a = this;
                this.b = sb2;
                this.c = strArr;
                this.d = conversationId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                String str = this.b;
                String[] strArr2 = this.c;
                ConversationId conversationId2 = this.d;
                ctimVar.g.d(ctimVar.ak("messages"), str, strArr2);
                for (String str2 : strArr2) {
                    ctimVar.ae(str2);
                }
                ctimVar.ad(conversationId2);
            }
        });
    }

    @Override // defpackage.cusm
    public final void j(final ConversationId conversationId, final long j) {
        final String valueOf = String.valueOf(D(conversationId));
        Integer[] numArr = {Integer.valueOf(cugo.OUTGOING_PENDING_SEND.m), Integer.valueOf(cugo.OUTGOING_SENDING.m)};
        Integer[] numArr2 = {Integer.valueOf(cugo.OUTGOING_FAILED_SEND.m), Integer.valueOf(cugo.LOCAL.m)};
        String join = TextUtils.join(", ", numArr);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 82);
        sb.append("conversation_row_id = ?  AND server_timestamp_us <= ? AND message_status NOT IN (");
        sb.append(join);
        sb.append(")");
        final String sb2 = sb.toString();
        final String[] strArr = {valueOf, String.valueOf(j)};
        String join2 = TextUtils.join(", ", numArr2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(join2).length() + 51);
        sb3.append("conversation_row_id = ?  AND message_status IN ( ");
        sb3.append(join2);
        sb3.append(") ");
        final String sb4 = sb3.toString();
        final String[] strArr2 = {valueOf};
        ctiv.a(this.g, new Runnable(this, sb2, strArr, sb4, strArr2, valueOf, j, conversationId) { // from class: ctik
            private final ctim a;
            private final String b;
            private final String[] c;
            private final String d;
            private final String[] e;
            private final String f;
            private final long g;
            private final ConversationId h;

            {
                this.a = this;
                this.b = sb2;
                this.c = strArr;
                this.d = sb4;
                this.e = strArr2;
                this.f = valueOf;
                this.g = j;
                this.h = conversationId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                String str = this.b;
                String[] strArr3 = this.c;
                String str2 = this.d;
                String[] strArr4 = this.e;
                String str3 = this.f;
                long j2 = this.g;
                ConversationId conversationId2 = this.h;
                ctimVar.g.d(ctimVar.ak("messages"), str, strArr3);
                ctimVar.g.d(ctimVar.ak("messages"), str2, strArr4);
                Cursor a = ctimVar.g.a(ctimVar.ak("messages"), new String[]{"message_id"}, "conversation_row_id = ?", new String[]{str3}, null, "1");
                try {
                    if (!a.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("update_timestamp_us", (Long) (-1L));
                        ctimVar.g.c(ctimVar.ak("conversations"), contentValues, "id = ?", new String[]{String.valueOf(str3)});
                    }
                    if (a != null) {
                        a.close();
                    }
                    a = ctimVar.g.a(ctimVar.ak("conversations"), new String[]{"last_deleted_timestamp_us"}, "id = ?", new String[]{str3}, null, null);
                    try {
                        if (a.moveToFirst() && a.getLong(0) < j2) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("last_deleted_timestamp_us", Long.valueOf(j2));
                            ctimVar.g.c(ctimVar.ak("conversations"), contentValues2, "id = ?", new String[]{String.valueOf(str3)});
                        }
                        if (a != null) {
                            a.close();
                        }
                        ctimVar.ad(conversationId2);
                        ctimVar.Z();
                    } finally {
                    }
                } finally {
                }
            }
        });
    }

    @Override // defpackage.cusm
    public final int k(long j, long j2) {
        if (j >= j2) {
            cstl.a("SQLiteMessagingStore");
            return 0;
        }
        String join = TextUtils.join(", ", new Integer[]{Integer.valueOf(cugo.OUTGOING_PENDING_SEND.m), Integer.valueOf(cugo.OUTGOING_SENDING.m), Integer.valueOf(cugo.OUTGOING_FAILED_SEND.m)});
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 65);
        sb.append("message_status NOT IN (");
        sb.append(join);
        sb.append(") AND ");
        sb.append("server_timestamp_us");
        sb.append(" BETWEEN ? AND ? ");
        final String sb2 = sb.toString();
        final String[] strArr = {String.valueOf(j), String.valueOf(j2)};
        return ((Integer) ctiv.b(this.g, new Callable(this, sb2, strArr) { // from class: ctil
            private final ctim a;
            private final String b;
            private final String[] c;

            {
                this.a = this;
                this.b = sb2;
                this.c = strArr;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                int d = ctimVar.g.d(ctimVar.ak("messages"), this.b, this.c);
                ctimVar.Z();
                return Integer.valueOf(d);
            }
        })).intValue();
    }

    @Override // defpackage.cusm
    public final void l(cugu... cuguVarArr) {
        dccx F = dcdc.F();
        for (cugu cuguVar : cuguVarArr) {
            cugi n = cuguVar.n();
            n.k(cuau.a);
            n.f(cugt.INVALID.h);
            n.t(dspd.b);
            F.g(n.a());
        }
        B(F.f());
    }

    public final dcdc<cufp> m(Cursor cursor) {
        dcdc f;
        dccx F = dcdc.F();
        if (cursor.moveToFirst()) {
            do {
                try {
                    dbsg<cufp> a = ctjv.a(cursor);
                    if (a.a()) {
                        F.g(ctjm.b(a.b()));
                    } else {
                        ctxm r = ctxn.r();
                        r.g(10031);
                        F.g(ctjm.a(r.a()));
                    }
                } catch (Exception unused) {
                    ctxm r2 = ctxn.r();
                    r2.g(10031);
                    F.g(ctjm.a(r2.a()));
                }
            } while (cursor.moveToNext());
            f = F.f();
        } else {
            f = F.f();
        }
        dcdc<ctxn> d = ctjz.d(f);
        int size = d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.b(d.get(i2));
        }
        return ctjz.e(f);
    }

    @Override // defpackage.cusm
    public final cuss<Integer> n(final dbsl<cufw> dbslVar, final Integer num) {
        final ctlp aD = aD(ctlw.a, -1, 0, new dbsl(dbslVar) { // from class: ctgl
            private final dbsl a;

            {
                this.a = dbslVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dbsl dbslVar2 = this.a;
                Pair pair = (Pair) obj;
                int i2 = ctim.h;
                return pair != null && dbslVar2.a((cufw) pair.second);
            }
        });
        return new cusj(cusl.d(aA(aD, new Callable(this, aD) { // from class: ctgm
            private final ctim a;
            private final ctlp b;

            {
                this.a = this;
                this.b = aD;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                return new ctlj(ctimVar.a, ctie.a, ctimVar.g, ctln.d(ctimVar.c), this.b);
            }
        }), ctgn.a), new dbrn(this, num) { // from class: ctgk
            private final ctim a;
            private final Integer b;

            {
                this.a = this;
                this.b = num;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ctim ctimVar = this.a;
                final Integer num2 = this.b;
                dcdc dcdcVar = (dcdc) obj;
                dccx dccxVar = new dccx();
                if (dcdcVar != null) {
                    int size = dcdcVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        dccxVar.g(Integer.toString(((Integer) ((Pair) dcdcVar.get(i2)).first).intValue()));
                    }
                }
                dcdc f = dccxVar.f();
                ctlo i3 = ctlp.i();
                i3.d(ctimVar.ak("messages"));
                ctky ctkyVar = (ctky) i3;
                ctkyVar.a = dcdc.f(ctiw.a("messages", "conversation_row_id"));
                String a = ctiw.a("messages", "conversation_row_id");
                String i4 = ctiw.i(f.size());
                String a2 = ctiw.a("messages", "message_status");
                String i5 = ctiw.i(ctimVar.o().length);
                int length = String.valueOf(a).length();
                int length2 = String.valueOf(i4).length();
                StringBuilder sb = new StringBuilder(length + 17 + length2 + String.valueOf(a2).length() + String.valueOf(i5).length());
                sb.append(a);
                sb.append(" IN (");
                sb.append(i4);
                sb.append(") AND ");
                sb.append(a2);
                sb.append(" IN (");
                sb.append(i5);
                sb.append(")");
                ctkyVar.b = sb.toString();
                dccx dccxVar2 = new dccx();
                dccxVar2.i(f);
                dccxVar2.i(dcdc.t(ctimVar.o()));
                ctkyVar.c = dccxVar2.f();
                ctkyVar.d = null;
                return ctimVar.aj(i3.a(), ctimVar.a, new dbrn(num2) { // from class: ctif
                    private final Integer a;

                    {
                        this.a = num2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Integer num3 = this.a;
                        Cursor cursor = (Cursor) obj2;
                        HashSet hashSet = new HashSet();
                        while (cursor != null && cursor.moveToNext() && (num3.intValue() == -1 || hashSet.size() < num3.intValue())) {
                            hashSet.add(Integer.valueOf(cursor.getInt(0)));
                        }
                        return Integer.valueOf(hashSet.size());
                    }
                }, ctln.i(ctimVar.c, cugo.INCOMING_RECEIVED));
            }
        });
    }

    public final String[] o() {
        ArrayList arrayList = new ArrayList();
        dcdc<cugo> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.toString(dcdcVar.get(i2).m));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // defpackage.cusm
    public final cuss<dcdc<cugu>> p(final ConversationId conversationId, int i2, int i3, cugt[] cugtVarArr) {
        String sb;
        String str;
        String[] c;
        String[] strArr;
        if (conversationId.c() == ConversationId.IdType.GROUP) {
            String str2 = i;
            String a = ctiw.a("contacts", "id");
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(a).length());
            sb2.append("((");
            sb2.append(str2);
            sb2.append(") LEFT JOIN ");
            sb2.append("contacts");
            sb2.append(" ON ");
            sb2.append("sender_contact_row_id");
            sb2.append(" = ");
            sb2.append(a);
            sb2.append(")");
            sb = sb2.toString();
            strArr = new String[]{conversationId.d().a(), conversationId.d().b()};
            c = ctiw.c(ctiw.b("messages", ctlz.a), ctiw.b("contacts", ctlu.a));
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
        } else {
            String str3 = i;
            String a2 = ctiw.a("s", "id");
            String a3 = ctiw.a("o", "id");
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu + String.valueOf(a2).length() + 1 + String.valueOf(a3).length());
            sb3.append("(((");
            sb3.append(str3);
            sb3.append(") LEFT JOIN ");
            sb3.append("contacts");
            sb3.append(" AS ");
            sb3.append("s");
            sb3.append(" ON ");
            sb3.append("sender_contact_row_id");
            sb3.append(" = ");
            sb3.append(a2);
            sb3.append(") INNER JOIN ");
            sb3.append("contacts");
            sb3.append(" AS ");
            sb3.append("o");
            sb3.append(" ON ");
            sb3.append("other_contact_row_id");
            sb3.append(" = ");
            sb3.append(a3);
            sb3.append(")");
            sb = sb3.toString();
            Pair<String, String[]> aB = aB("o", conversationId.e());
            str = (String) aB.first;
            c = ctiw.c(ctiw.b("messages", ctlz.a), ctiw.b("s", ctlu.a));
            strArr = (String[]) aB.second;
        }
        String valueOf = String.valueOf(str);
        int length = cugtVarArr.length;
        String join = TextUtils.join(", ", Collections.nCopies(length, '?'));
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(join).length());
        sb4.append(valueOf);
        sb4.append(" AND rendering_type IN (");
        sb4.append(join);
        sb4.append(")");
        String sb5 = sb4.toString();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + length);
        for (int i4 = 0; i4 < cugtVarArr.length; i4++) {
            strArr2[strArr.length + i4] = Integer.toString(cugtVarArr[i4].h);
        }
        ctlo i5 = ctlp.i();
        i5.d(ak(sb));
        ctky ctkyVar = (ctky) i5;
        ctkyVar.a = dcdc.t(c);
        ctkyVar.b = sb5;
        ctkyVar.c = dcdc.t(strArr2);
        ctkyVar.d = i3 != 0 ? null : "server_timestamp_us DESC";
        i5.b(i2);
        return aj(i5.a(), this.a, new dbrn(this, conversationId) { // from class: ctgo
            private final ctim a;
            private final ConversationId b;

            {
                this.a = this;
                this.b = conversationId;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ctim ctimVar = this.a;
                dcdc<ctjz<cugu>> b = ctkf.b(this.b, (Cursor) obj);
                dcdc<ctxn> d = ctjz.d(b);
                int size = d.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ctimVar.b.b(d.get(i6));
                }
                return ctjz.e(b);
            }
        }, ctln.a(this.c, conversationId));
    }

    @Override // defpackage.cusm
    public final cuss<dbsg<cugu>> q(String str, final ConversationId conversationId) {
        String str2 = i;
        String a = ctiw.a("contacts", "id");
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(a).length());
        sb.append("((");
        sb.append(str2);
        sb.append(") LEFT JOIN ");
        sb.append("contacts");
        sb.append(" ON ");
        sb.append("sender_contact_row_id");
        sb.append(" = ");
        sb.append(a);
        sb.append(")");
        String sb2 = sb.toString();
        String[] c = ctiw.c(ctiw.b("messages", ctlz.a), ctiw.b("contacts", ctlu.a));
        ctlo i2 = ctlp.i();
        i2.d(ak(sb2));
        dcdc<String> t = dcdc.t(c);
        ctky ctkyVar = (ctky) i2;
        ctkyVar.a = t;
        ctkyVar.b = "message_id =?";
        ctkyVar.c = dcdc.t(new String[]{str});
        return aj(i2.a(), this.a, new dbrn(conversationId) { // from class: ctgq
            private final ConversationId a;

            {
                this.a = conversationId;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ConversationId conversationId2 = this.a;
                Cursor cursor = (Cursor) obj;
                int i3 = ctim.h;
                return !cursor.moveToFirst() ? dbpy.a : dbsg.i(ctkf.a(conversationId2, cursor));
            }
        }, ctln.j(this.c, str));
    }

    @Override // defpackage.cusm
    public final cuss<dbsg<cufp>> r(ConversationId conversationId) {
        String concat;
        String[] strArr;
        if (conversationId.c() == ConversationId.IdType.GROUP) {
            strArr = new String[]{String.valueOf(ConversationId.IdType.GROUP.c), conversationId.d().a(), conversationId.d().b()};
            concat = "conversation_type = ? AND conversation_group_id = ? AND conversation_group_app_name = ?";
        } else {
            Pair<String, String[]> aB = aB("c", conversationId.e());
            String valueOf = String.valueOf((String) aB.first);
            concat = valueOf.length() != 0 ? "conversation_type = ?AND ".concat(valueOf) : new String("conversation_type = ?AND ");
            strArr = (String[]) dclq.b(new String[]{String.valueOf(ConversationId.IdType.ONE_TO_ONE.c)}, (String[]) aB.second, String.class);
        }
        Pair create = Pair.create(concat, strArr);
        String aC = aC();
        String[] c = ctiw.c(ctiw.b("conversations", ctlw.b), ctiw.b("o", ctlu.a), ctiw.b("c", ctlu.a));
        ctlo i2 = ctlp.i();
        i2.d(ak(aC));
        ctky ctkyVar = (ctky) i2;
        ctkyVar.a = dcdc.t(c);
        ctkyVar.b = (String) create.first;
        ctkyVar.c = dcdc.t((String[]) create.second);
        ctkyVar.d = null;
        return aj(i2.a(), this.a, ctgr.a, ctln.f(this.c, conversationId));
    }

    public final long s(cufp cufpVar, boolean z) {
        byte[] bArr;
        long D = D(cufpVar.a());
        if (D == -1) {
            return ax(cufpVar);
        }
        dbsg<cufp> G = G(D);
        if (z && G.a() && G.b().f().longValue() != -1) {
            return D;
        }
        ContentValues contentValues = new ContentValues();
        if (G.a()) {
            try {
                HashMap<String, Object> b = ctjv.b(G.b());
                ctjv.f(b, cufpVar);
                bArr = csto.a(b);
            } catch (IOException unused) {
                cstl.a("ConversationCursors");
                bArr = new byte[0];
            }
            contentValues.put("conversation_properties", bArr);
        } else {
            contentValues.put("conversation_properties", ctjv.c(cufpVar));
        }
        contentValues.put("conversation_app_data", ctjv.d(dcjz.e(cufpVar.i())));
        if (this.g.c(ak("conversations"), contentValues, "id = ?", new String[]{String.valueOf(D)}) < 0) {
            cstl.a("SQLiteMessagingStore");
            return -1L;
        }
        aa(cufpVar.a());
        Z();
        return D;
    }

    @Override // defpackage.cusm
    public final void t(final ConversationId conversationId) {
        ctiv.a(this.g, new Runnable(this, conversationId) { // from class: ctgu
            private final ctim a;
            private final ConversationId b;

            {
                this.a = this;
                this.b = conversationId;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                ConversationId conversationId2 = this.b;
                long D = ctimVar.D(conversationId2);
                if (D == -1) {
                    String valueOf = String.valueOf(conversationId2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    sb.append("Attempting to delete a non-existent conversation: ");
                    sb.append(valueOf);
                    sb.toString();
                    cstl.a("SQLiteMessagingStore");
                } else if (ctimVar.g.d(ctimVar.ak("conversations"), "id = ?", new String[]{String.valueOf(D)}) < 0) {
                    throw new SQLiteException("Failed to delete conversation.");
                } else {
                    ctimVar.Z();
                }
            }
        });
    }

    @Override // defpackage.cusm
    public final cuss<dbsg<cufj>> u(ContactId contactId) {
        Pair<String, String[]> aE = aE(contactId);
        ctlo i2 = ctlp.i();
        i2.d(ak("contacts"));
        ctky ctkyVar = (ctky) i2;
        ctkyVar.a = dcdc.t(ctlu.a);
        ctkyVar.b = (String) aE.first;
        ctkyVar.c = dcdc.t((String[]) aE.second);
        ctkyVar.d = null;
        return aj(i2.a(), this.a, ctgv.a, ctln.g(this.c, contactId));
    }

    @Override // defpackage.cusm
    public final long v(final cufj cufjVar) {
        return ((Long) ctiv.b(this.g, new Callable(this, cufjVar) { // from class: ctgw
            private final ctim a;
            private final cufj b;

            {
                this.a = this;
                this.b = cufjVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                cufj cufjVar2 = this.b;
                if (ctimVar.Y(cufjVar2.a()) == -1) {
                    return Long.valueOf(ctimVar.V(cufjVar2));
                }
                return -1L;
            }
        })).longValue();
    }

    @Override // defpackage.cusm
    public final cuss<Integer> w(cugo cugoVar) {
        dcdc<String> f = dcdc.f(Integer.toString(cugoVar.m));
        ctlo i2 = ctlp.i();
        i2.d(ak("messages"));
        ctky ctkyVar = (ctky) i2;
        ctkyVar.a = dcdc.f("id");
        ctkyVar.b = "message_status = ?";
        ctkyVar.c = f;
        ctkyVar.d = null;
        return aj(i2.a(), this.a, ctgy.a, ctln.i(this.c, cugoVar));
    }

    @Override // defpackage.cusm
    public final void x(final cugu cuguVar, final long j) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("server_timestamp_us", Long.valueOf(j));
        ctiv.a(this.g, new Runnable(this, contentValues, cuguVar, j) { // from class: ctgz
            private final ctim a;
            private final ContentValues b;
            private final cugu c;
            private final long d;

            {
                this.a = this;
                this.b = contentValues;
                this.c = cuguVar;
                this.d = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ctim ctimVar = this.a;
                ContentValues contentValues2 = this.b;
                cugu cuguVar2 = this.c;
                long j2 = this.d;
                ctimVar.g.c(ctimVar.ak("messages"), contentValues2, "message_id = ?", new String[]{cuguVar2.a()});
                long D = ctimVar.D(cuguVar2.c());
                if (D != -1) {
                    ctimVar.W(D, Long.valueOf(j2));
                } else {
                    cstl.a("SQLiteMessagingStore");
                }
            }
        });
        ae(cuguVar.a());
        ad(cuguVar.c());
    }

    @Override // defpackage.cusm
    public final void y(List<cugu> list, cugo cugoVar, cugo cugoVar2) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (cugu cuguVar : list) {
            arrayList.add(cuguVar.a());
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("message_status", Integer.valueOf(cugoVar2.m));
        boolean z = false;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int min = Math.min(i2 + 997, arrayList.size());
            final List subList = arrayList.subList(i2, min);
            final String[] strArr = new String[subList.size() + 1];
            subList.toArray(strArr);
            strArr[subList.size()] = Integer.toString(cugoVar.m);
            ctiv.b(this.g, new Callable(this, contentValues, subList, strArr) { // from class: cthb
                private final ctim a;
                private final ContentValues b;
                private final List c;
                private final String[] d;

                {
                    this.a = this;
                    this.b = contentValues;
                    this.c = subList;
                    this.d = strArr;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ctim ctimVar = this.a;
                    ContentValues contentValues2 = this.b;
                    List list2 = this.c;
                    String[] strArr2 = this.d;
                    ctir ctirVar = ctimVar.g;
                    Uri ak = ctimVar.ak("messages");
                    String i3 = ctiw.i(list2.size());
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 39);
                    sb.append("message_id IN (");
                    sb.append(i3);
                    sb.append(") AND ");
                    sb.append("message_status");
                    sb.append(" = ?");
                    return Integer.valueOf(ctirVar.c(ak, contentValues2, sb.toString(), strArr2));
                }
            });
            i2 = min;
        }
        HashSet<ConversationId> hashSet = new HashSet();
        for (cugu cuguVar2 : list) {
            hashSet.add(cuguVar2.c());
            ae(cuguVar2.a());
        }
        if (this.d.contains(cugoVar2) || this.d.contains(cugoVar)) {
            z = true;
        }
        for (ConversationId conversationId : hashSet) {
            ad(conversationId);
            if (z) {
                ag(conversationId);
            }
        }
        af(cugoVar);
        af(cugoVar2);
    }

    @Override // defpackage.cusm
    public final dcdc<String> z(final ConversationId conversationId, final cugo cugoVar, final cugo cugoVar2) {
        return (dcdc) ctiv.b(this.g, new Callable(this, cugoVar2, conversationId, cugoVar) { // from class: cthc
            private final ctim a;
            private final cugo b;
            private final ConversationId c;
            private final cugo d;

            {
                this.a = this;
                this.b = cugoVar2;
                this.c = conversationId;
                this.d = cugoVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctim ctimVar = this.a;
                cugo cugoVar3 = this.b;
                ConversationId conversationId2 = this.c;
                cugo cugoVar4 = this.d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_status", Integer.valueOf(cugoVar3.m));
                String[] strArr = {Long.toString(ctimVar.D(conversationId2)), Integer.toString(cugoVar4.m)};
                dccx F = dcdc.F();
                Cursor a = ctimVar.g.a(ctimVar.ak("messages"), new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ?", strArr, null, null);
                try {
                    if (a.moveToFirst()) {
                        ctimVar.g.c(ctimVar.ak("messages"), contentValues, "conversation_row_id = ? AND message_status = ?", strArr);
                        ctimVar.ae(a.getString(0));
                        do {
                            F.g(a.getString(0));
                        } while (a.moveToNext());
                        if (ctimVar.d.contains(cugoVar3) || ctimVar.d.contains(cugoVar4)) {
                            ctimVar.ag(conversationId2);
                        }
                        ctimVar.ad(conversationId2);
                        ctimVar.af(cugoVar4);
                        ctimVar.af(cugoVar3);
                    }
                    dcdc f = F.f();
                    if (a != null) {
                        a.close();
                    }
                    return f;
                } catch (Throwable th) {
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
        });
    }
}
