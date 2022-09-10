package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cuip  reason: default package */
/* loaded from: classes5.dex */
public final class cuip implements ctuk {
    private final cuiv a;

    public cuip(cuiv cuivVar) {
        this.a = cuivVar;
    }

    @Override // defpackage.ctuk
    public final ctuj a() {
        return new cukd();
    }

    @Override // defpackage.ctuk
    public final String b() {
        return "photos";
    }

    @Override // defpackage.ctuk
    public final dehn<cugu> c(final ctyy ctyyVar, final cugu cuguVar) {
        cuiv cuivVar = this.a;
        final ConversationId c = cuguVar.c();
        dbsg<cukp> b = cuiq.b(cuguVar);
        if (!b.a()) {
            cstl.a("PhotosMsgController");
            return deha.b(new IOException("Cannot upload non-photo message"));
        }
        final cukp b2 = b.b();
        if (b2.b() == null) {
            cstl.a("PhotosMsgController");
            return deha.b(new IOException("Missing local URI for upload"));
        } else if (b2.a() != null) {
            cstl.a("PhotosMsgController");
            return deha.a(cuguVar);
        } else {
            final cujn cujnVar = (cujn) cuivVar;
            return cujnVar.i.c(new Callable(cujnVar, b2, cuguVar, c, ctyyVar) { // from class: cuji
                private final cujn a;
                private final cukp b;
                private final cugu c;
                private final ConversationId d;
                private final ctyy e;

                {
                    this.a = cujnVar;
                    this.b = b2;
                    this.c = cuguVar;
                    this.d = c;
                    this.e = ctyyVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    byte[] a;
                    final cujn cujnVar2 = this.a;
                    final cukp cukpVar = this.b;
                    cugu cuguVar2 = this.c;
                    ConversationId conversationId = this.d;
                    ctyy ctyyVar2 = this.e;
                    cujnVar2.d();
                    String b3 = cukpVar.b();
                    if (cujnVar2.j(cukpVar.b())) {
                        InputStream k = cujnVar2.k(Uri.parse(cukpVar.b()));
                        try {
                            a = ddak.b(k);
                            if (k != null) {
                                k.close();
                            }
                        } catch (Throwable th) {
                            if (k != null) {
                                try {
                                    k.close();
                                } catch (Throwable th2) {
                                    deki.a(th, th2);
                                }
                            }
                            throw th;
                        }
                    } else {
                        a = cuix.a(cujnVar2.b, cujnVar2.j, Uri.parse(cukpVar.b()), cswe.a(cujnVar2.b).am.f().intValue(), cswe.a(cujnVar2.b).an.f().intValue(), Math.min(cswe.a(cujnVar2.b).al.f().intValue(), cukpVar.f()), cswe.a(cujnVar2.b).ac.f().intValue());
                        File file = new File(cujn.l(cuguVar2.a()));
                        cujnVar2.e().mkdirs();
                        String absolutePath = cujnVar2.e().getAbsolutePath();
                        String str = File.separator;
                        String f = cujn.f(conversationId.a());
                        String h = cujn.h(conversationId);
                        String name = file.getName();
                        int length = String.valueOf(absolutePath).length();
                        int length2 = String.valueOf(str).length();
                        int length3 = String.valueOf(f).length();
                        StringBuilder sb = new StringBuilder(length + 1 + length2 + length3 + String.valueOf(h).length() + String.valueOf(name).length());
                        sb.append(absolutePath);
                        sb.append(str);
                        sb.append(f);
                        sb.append(h);
                        sb.append("_");
                        sb.append(name);
                        File file2 = new File(new File(sb.toString()).getAbsolutePath());
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            fileOutputStream.write(a);
                            fileOutputStream.close();
                            b3 = Uri.fromFile(file2.getAbsoluteFile()).toString();
                        } catch (Throwable th3) {
                            fileOutputStream.close();
                            throw th3;
                        }
                    }
                    String str2 = b3;
                    byte[] bArr = a;
                    if (bArr == null) {
                        throw new IOException("Failed to compress image");
                    }
                    byte[] e = cukpVar.c().e(new dbty(cujnVar2, cukpVar) { // from class: cujj
                        private final cujn a;
                        private final cukp b;

                        {
                            this.a = cujnVar2;
                            this.b = cukpVar;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            cujn cujnVar3 = this.a;
                            return cuix.a(cujnVar3.b, cujnVar3.j, Uri.parse(this.b.b()), cswe.a(cujnVar3.b).aj.f().intValue(), cswe.a(cujnVar3.b).ak.f().intValue(), cswe.a(cujnVar3.b).ai.f().intValue(), cswe.a(cujnVar3.b).ad.f().intValue());
                        }
                    });
                    if (e == null) {
                        throw new IOException("Failed to generate thumbnail");
                    }
                    cuko h2 = cukpVar.h();
                    h2.h(e);
                    h2.d(str2);
                    cukp a2 = h2.a();
                    cugi n = cuguVar2.n();
                    cugk c2 = cugl.c();
                    ((cudv) c2).a = "photos";
                    c2.b(cuiq.a(a2).b());
                    n.s(c2.a());
                    cujnVar2.f.a(ctyyVar2).f(n.a());
                    cuka cukaVar = cujnVar2.c;
                    ctmm c3 = ctmn.c();
                    ((ctmh) c3).a = "ScottyUpload";
                    c3.b(ctmr.c);
                    ctmn a3 = c3.a();
                    ctog ctogVar = cukaVar.c;
                    ctxm r = ctxn.r();
                    r.g(28);
                    r.n(ctyyVar2.b().e());
                    r.o(ctyyVar2.c().J());
                    r.p(cuguVar2.a());
                    r.d(cuguVar2.c());
                    ctogVar.b(r.a());
                    ctss ctssVar = cukaVar.a;
                    UUID randomUUID = UUID.randomUUID();
                    cukh cukhVar = new cukh(ctyyVar2, conversationId, bArr);
                    Context context = cukaVar.b;
                    dehn a4 = ctssVar.a(randomUUID, cukhVar, deha.a(new cujw(context, new cukc(context, null))), ctyyVar2, a3, true);
                    deha.q(a4, new cujz(cukaVar, ctyyVar2, cuguVar2), dege.a);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    int length4 = bArr.length;
                    BitmapFactory.decodeByteArray(bArr, 0, length4, options);
                    int i = options.outHeight;
                    int i2 = options.outWidth;
                    cuko h3 = cukpVar.h();
                    h3.e(((cujv) a4.get()).a());
                    h3.h(e);
                    h3.i(i2);
                    h3.c(i);
                    h3.f(length4);
                    h3.d(str2);
                    cukp a5 = h3.a();
                    cugi n2 = cuguVar2.n();
                    cugk c4 = cugl.c();
                    ((cudv) c4).a = "photos";
                    c4.b(cuiq.a(a5).b());
                    n2.s(c4.a());
                    cugu a6 = n2.a();
                    cujnVar2.f.a(ctyyVar2).f(a6);
                    return a6;
                }
            });
        }
    }

    @Override // defpackage.ctuk
    public final void d(ctyy ctyyVar, cugu cuguVar, ctxo ctxoVar) {
        ctxm r = ctxn.r();
        r.g(27);
        r.n(ctyyVar.b().e());
        r.o(ctyyVar.c().J());
        r.p(cuguVar.a());
        r.d(cuguVar.c());
        ctxoVar.b(r.a());
    }

    @Override // defpackage.ctuk
    public final void e(ctyy ctyyVar, cugu cuguVar, ctxo ctxoVar) {
        ctxm r = ctxn.r();
        r.g(26);
        r.n(ctyyVar.b().e());
        r.o(ctyyVar.c().J());
        r.p(cuguVar.a());
        r.d(cuguVar.c());
        ctxoVar.b(r.a());
    }

    @Override // defpackage.ctuk
    public final void f(final ctyy ctyyVar) {
        final cujn cujnVar = (cujn) this.a;
        cujnVar.g.c(new Callable(cujnVar, ctyyVar) { // from class: cujg
            private final cujn a;
            private final ctyy b;

            {
                this.a = cujnVar;
                this.b = ctyyVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cujn cujnVar2 = this.a;
                dcdc<ContactId> f = this.b.b().f();
                int size = f.size();
                boolean z = true;
                for (int i = 0; i < size; i++) {
                    ContactId contactId = f.get(i);
                    String str = cujnVar2.d;
                    String str2 = File.separator;
                    String str3 = File.separator;
                    String g = cujn.g(contactId);
                    String str4 = File.separator;
                    int length = String.valueOf(str).length();
                    int length2 = String.valueOf(str2).length();
                    StringBuilder sb = new StringBuilder(length + 6 + length2 + String.valueOf(str3).length() + String.valueOf(g).length() + String.valueOf(str4).length());
                    sb.append(str);
                    sb.append(str2);
                    sb.append("photos");
                    sb.append(str3);
                    sb.append(g);
                    sb.append(str4);
                    File file = new File(sb.toString());
                    if (file.exists()) {
                        z = z && cujnVar2.i(file, null);
                    }
                    String str5 = cujnVar2.d;
                    String str6 = File.separator;
                    String str7 = File.separator;
                    String str8 = cujnVar2.e;
                    String str9 = File.separator;
                    int length3 = String.valueOf(str5).length();
                    int length4 = String.valueOf(str6).length();
                    StringBuilder sb2 = new StringBuilder(length3 + 6 + length4 + String.valueOf(str7).length() + String.valueOf(str8).length() + String.valueOf(str9).length());
                    sb2.append(str5);
                    sb2.append(str6);
                    sb2.append("photos");
                    sb2.append(str7);
                    sb2.append(str8);
                    sb2.append(str9);
                    File file2 = new File(sb2.toString());
                    if (file2.exists()) {
                        z = z && cujnVar2.i(file2, cujn.g(contactId));
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.ctuk
    public final void g(final ConversationId conversationId) {
        final cujn cujnVar = (cujn) this.a;
        final dehn c = cujnVar.g.c(new Callable(cujnVar, conversationId) { // from class: cuiy
            private final cujn a;
            private final ConversationId b;

            {
                this.a = cujnVar;
                this.b = conversationId;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cujn cujnVar2 = this.a;
                return Boolean.valueOf(cujnVar2.i(new File(cujnVar2.a(this.b, "")).getParentFile(), null));
            }
        });
        final dehn c2 = cujnVar.g.c(new Callable(cujnVar, conversationId) { // from class: cuje
            private final cujn a;
            private final ConversationId b;

            {
                this.a = cujnVar;
                this.b = conversationId;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                cujn cujnVar2 = this.a;
                ConversationId conversationId2 = this.b;
                File e = cujnVar2.e();
                String valueOf = String.valueOf(cujn.f(conversationId2.a()));
                String valueOf2 = String.valueOf(cujn.h(conversationId2));
                return Boolean.valueOf(cujnVar2.i(e, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
            }
        });
        deha.k(c, c2).b(new Callable(c, c2) { // from class: cujf
            private final dehn a;
            private final dehn b;

            {
                this.a = c;
                this.b = c2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dehn dehnVar = this.a;
                dehn dehnVar2 = this.b;
                boolean z = false;
                if (((Boolean) deha.r(dehnVar)).booleanValue() && ((Boolean) deha.r(dehnVar2)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, cujnVar.g);
    }
}
