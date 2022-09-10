package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cujn  reason: default package */
/* loaded from: classes5.dex */
public final class cujn implements cuiv {
    static final AtomicBoolean a = new AtomicBoolean(false);
    public final Context b;
    public final cuka c;
    public final String d;
    public final String e;
    public final ctgc f;
    public final ctog h;
    public final cukr j;
    private final File k;
    private final File l;
    private final File m;
    private final File n;
    public final dehp g = cstu.b().a;
    private boolean o = false;
    public final dehp i = dehx.c(Executors.newSingleThreadExecutor());

    public cujn(Context context, cuka cukaVar, ctgc ctgcVar, String str, cukr cukrVar) {
        this.b = context;
        this.c = cukaVar;
        this.d = str;
        this.e = new File(str).getName();
        this.f = ctgcVar;
        this.h = ctog.a(context);
        this.j = cukrVar;
        String str2 = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str2);
        sb.append("tmp");
        this.k = new File(sb.toString());
        String str3 = File.separator;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(str3);
        sb2.append("photos");
        File file = new File(sb2.toString());
        this.l = file;
        String absolutePath = file.getAbsolutePath();
        String str4 = File.separator;
        StringBuilder sb3 = new StringBuilder(String.valueOf(absolutePath).length() + 6 + String.valueOf(str4).length());
        sb3.append(absolutePath);
        sb3.append(str4);
        sb3.append("images");
        File file2 = new File(sb3.toString());
        this.m = file2;
        String absolutePath2 = file2.getAbsolutePath();
        String str5 = File.separator;
        StringBuilder sb4 = new StringBuilder(String.valueOf(absolutePath2).length() + 3 + String.valueOf(str5).length());
        sb4.append(absolutePath2);
        sb4.append(str5);
        sb4.append("tmp");
        this.n = new File(sb4.toString());
    }

    public static String f(ContactId contactId) {
        try {
            return g(contactId);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unexpected encoding exception", e);
        }
    }

    public static String g(ContactId contactId) {
        String a2 = contactId.a();
        String b = contactId.b();
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(b).length());
        sb.append(a2);
        sb.append("_");
        sb.append(b);
        return URLEncoder.encode(sb.toString(), "UTF-8");
    }

    public static String h(ConversationId conversationId) {
        try {
            dyiy dyiyVar = dyiy.OK;
            ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
            int ordinal = conversationId.c().ordinal();
            if (ordinal == 0) {
                return g(conversationId.e());
            }
            if (ordinal != 1) {
                return "";
            }
            String a2 = conversationId.d().a();
            String b = conversationId.d().b();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1 + String.valueOf(b).length());
            sb.append(a2);
            sb.append("_");
            sb.append(b);
            return URLEncoder.encode(sb.toString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unexpected encoding exception", e);
        }
    }

    public static final String l(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        cstd.a();
        String format = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 5 + String.valueOf(str).length());
        sb.append(format);
        sb.append("_");
        sb.append(str);
        sb.append(".jpg");
        return sb.toString();
    }

    @Override // defpackage.cuiv
    public final String a(ConversationId conversationId, String str) {
        String absolutePath = this.m.getAbsolutePath();
        String str2 = File.separator;
        String h = h(conversationId);
        String str3 = File.separator;
        String valueOf = String.valueOf(dczd.a.a(str, dbrc.c));
        int length = String.valueOf(absolutePath).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(h).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append(absolutePath);
        sb.append(str2);
        sb.append(h);
        sb.append(str3);
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // defpackage.cuiv
    public final dehn<String> b(final ctyy ctyyVar, final cugu cuguVar, final cuiu cuiuVar) {
        final cukn cuknVar = ((cuis) cuiuVar).a;
        File file = new File(a(cuguVar.c(), cuknVar.a()));
        if (file.exists()) {
            return deha.a(Uri.fromFile(file).toString());
        }
        return deew.h(deew.g(degp.q(this.g.c(new Callable(this) { // from class: cuja
            private final cujn a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.d();
                return null;
            }
        })), new defg(this, ctyyVar, cuknVar, cuguVar, cuiuVar) { // from class: cujb
            private final cujn a;
            private final ctyy b;
            private final cukn c;
            private final cugu d;
            private final cuiu e;

            {
                this.a = this;
                this.b = ctyyVar;
                this.c = cuknVar;
                this.d = cuguVar;
                this.e = cuiuVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cujn cujnVar = this.a;
                ctyy ctyyVar2 = this.b;
                cukn cuknVar2 = this.c;
                cugu cuguVar2 = this.d;
                cuiu cuiuVar2 = this.e;
                Void r9 = (Void) obj;
                cuka cukaVar = cujnVar.c;
                String c = cujnVar.c(cuguVar2.c(), cuknVar2.a());
                ctmm c2 = ctmn.c();
                ((ctmh) c2).a = "LighterImageScottyDownload";
                c2.b(ctmr.c);
                return cukaVar.a(ctyyVar2, cuknVar2, cuguVar2, c, c2.a(), ((cuis) cuiuVar2).b);
            }
        }, this.g), new dbrn(this, cuguVar, cuknVar) { // from class: cujc
            private final cujn a;
            private final cugu b;
            private final cukn c;

            {
                this.a = this;
                this.b = cuguVar;
                this.c = cuknVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cujn cujnVar = this.a;
                cugu cuguVar2 = this.b;
                cukn cuknVar2 = this.c;
                cujt cujtVar = (cujt) obj;
                ConversationId c = cuguVar2.c();
                String a2 = cuknVar2.a();
                File file2 = new File(cujnVar.c(c, a2));
                File file3 = new File(cujnVar.a(c, a2));
                file3.getParentFile().mkdirs();
                file2.renameTo(file3);
                return Uri.fromFile(new File(file3.getAbsolutePath())).toString();
            }
        }, this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c(ConversationId conversationId, String str) {
        String absolutePath = this.n.getAbsolutePath();
        String str2 = File.separator;
        String h = h(conversationId);
        String str3 = File.separator;
        String valueOf = String.valueOf(dczd.a.a(str, dbrc.c));
        int length = String.valueOf(absolutePath).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(h).length();
        StringBuilder sb = new StringBuilder(length + length2 + length3 + String.valueOf(str3).length() + String.valueOf(valueOf).length());
        sb.append(absolutePath);
        sb.append(str2);
        sb.append(h);
        sb.append(str3);
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (dxzy.g()) {
            if (this.o) {
                return;
            }
            if (!a.getAndSet(true)) {
                if (!i(this.k, null)) {
                    cstl.a("PhotosMsgController");
                }
                if (!i(this.n, null)) {
                    cstl.a("PhotosMsgController");
                }
            }
            if (!this.k.exists()) {
                if (!this.k.mkdirs()) {
                    throw new IOException("Failed to create photo tmp dir");
                }
                String str = this.d;
                String str2 = File.separator;
                String str3 = File.separator;
                int length = String.valueOf(str).length();
                StringBuilder sb = new StringBuilder(length + 11 + String.valueOf(str2).length() + String.valueOf(str3).length());
                sb.append(str);
                sb.append(str2);
                sb.append("tmp");
                sb.append(str3);
                sb.append(".nomedia");
                if (!new File(sb.toString()).createNewFile()) {
                    throw new IOException("Failed to create tmp dir file");
                }
            }
            if (!this.l.exists() && !this.l.mkdirs()) {
                throw new IOException("Failed to create photo dir");
            }
            if (!this.n.exists()) {
                if (!this.n.mkdirs()) {
                    throw new IOException("Failed to create temporary images dir");
                }
                String absolutePath = this.n.getAbsolutePath();
                String str4 = File.separator;
                StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 8 + String.valueOf(str4).length());
                sb2.append(absolutePath);
                sb2.append(str4);
                sb2.append(".nomedia");
                if (!new File(sb2.toString()).createNewFile()) {
                    throw new IOException("Failed to create temporary images directory file");
                }
            }
            if (!this.m.exists() && !this.m.mkdirs()) {
                throw new IOException("Failed to create images directory");
            }
            this.o = true;
            return;
        }
        throw new IOException("Failed Photo Operation: photos is disabled by Phenotype flags");
    }

    public final File e() {
        String str = this.d;
        String str2 = File.separator;
        String str3 = File.separator;
        String str4 = this.e;
        String str5 = File.separator;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 6 + length2 + length3 + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append(str);
        sb.append(str2);
        sb.append("photos");
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return new File(sb.toString());
    }

    public final boolean i(File file, String str) {
        String name = file.getCanonicalFile().getName();
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list == null) {
                return false;
            }
            for (String str2 : list) {
                if (name.equals(new File(file, str2).getCanonicalFile().getParentFile().getName())) {
                    if ((str == null || str2.startsWith(str)) && !i(new File(file, str2), str)) {
                        return false;
                    }
                } else if (!new File(file, str2).delete()) {
                    return false;
                }
            }
        }
        if (str != null && !file.getName().startsWith(str)) {
            return true;
        }
        return file.delete();
    }

    public final boolean j(String str) {
        String path = Uri.parse(str).getPath();
        String str2 = this.d;
        String str3 = File.separator;
        String str4 = File.separator;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str2);
        sb.append(str3);
        sb.append("photos");
        sb.append(str4);
        return path.startsWith(new File(sb.toString()).getAbsolutePath());
    }

    public final InputStream k(Uri uri) {
        return this.b.getContentResolver().openInputStream(uri);
    }
}
