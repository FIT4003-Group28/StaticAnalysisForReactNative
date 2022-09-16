package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aesd  reason: default package */
/* loaded from: classes.dex */
public final class aesd extends afyl {
    public final afvm a;
    public final afvy b;
    private final Context c;
    private final byte[] k;
    private final amuk l;
    private final afzf m;
    private Map n;

    public aesd(Context context, String str, byte[] bArr, amuk amukVar, afvm afvmVar, afvy afvyVar, afzf afzfVar) {
        super(2, str, afzfVar);
        this.c = context;
        this.k = bArr;
        afms.a(afvmVar);
        this.a = afvmVar;
        this.b = afvyVar;
        this.m = afzfVar;
        this.l = amukVar;
        t();
        this.f = new aesc(this);
    }

    private static aese x(Context context, cew cewVar) {
        try {
            String h = acx.h(cewVar.c);
            byte[] bArr = cewVar.b;
            String str = new String(bArr, h);
            if (!str.startsWith("GLS/1.")) {
                throw new IOException("Invalid response from server. Expected GLS/1.x");
            }
            int indexOf = str.indexOf("\r\n\r\n");
            if (indexOf == -1) {
                throw new IOException("Invalid response from server. Could not locate DRM message");
            }
            String[] split = str.substring(0, indexOf).split("\r\n");
            Matcher matcher = Pattern.compile("GLS/[0-9]+\\.[0-9]+ ([0-9]+) (.*)").matcher(split[0]);
            if (!matcher.find()) {
                throw new Exception("pattern not found.");
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            HashMap hashMap = new HashMap();
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].split(": ");
                hashMap.put(split2[0], split2[1]);
            }
            return new aese(context, parseInt, Arrays.copyOfRange(bArr, indexOf + 4, bArr.length), hashMap);
        } catch (Exception e) {
            throw new cey(e);
        }
    }

    @Override // defpackage.afyl, defpackage.afye
    public final afvm e() {
        return this.a;
    }

    @Override // defpackage.yua
    public final Map f() {
        return this.n;
    }

    @Override // defpackage.yua
    public final boolean h() {
        return true;
    }

    @Override // defpackage.yua
    public final ytz i() {
        return ytz.IMMEDIATE;
    }

    @Override // defpackage.yua
    public final String m() {
        return Uri.parse(this.d).buildUpon().appendQueryParameter("rn", Integer.toString(this.f.a())).build().toString();
    }

    @Override // defpackage.yua
    public final byte[] qA() {
        return this.k;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        try {
            aese x = x(this.c, cewVar);
            return x.a == 0 ? cfb.b(x, null) : cfb.a(new aesf(x));
        } catch (cey e) {
            return cfb.a(e);
        }
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        ((anie) this.m).o((aesg) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.n = new HashMap();
        amuk amukVar = this.l;
        int size = amukVar.size();
        for (int i = 0; i < size; i++) {
            try {
                ((afxq) amukVar.get(i)).b(this.n, this);
            } catch (ceq e) {
                afus.b(1, 6, "AuthFailure while initialization request headers.");
                afkj.b(afki.DRM, "WindvineGlsRequest: AuthFailureError %s", e.toString());
            }
        }
    }

    @Override // defpackage.afyl
    public final List v() {
        byte[] bArr;
        StringBuilder sb = new StringBuilder("curl ");
        for (String str : this.n.keySet()) {
            sb.append("-H \"");
            sb.append(str);
            sb.append(":");
            sb.append((String) this.n.get(str));
            sb.append("\" ");
        }
        sb.append("--data-binary @<(echo '");
        try {
            bArr = this.k;
        } catch (ceq unused) {
            bArr = afyl.o;
        }
        sb.append(Base64.encodeToString(bArr, 2));
        sb.append("' | base64 -d - ) '");
        sb.append(m());
        sb.append("'");
        return Collections.singletonList(sb.toString());
    }

    @Override // defpackage.afyl
    public final synchronized List w(cew cewVar) {
        ArrayList arrayList;
        try {
            aese x = x(this.c, cewVar);
            arrayList = new ArrayList();
            arrayList.add("GLS response logging with binary data converted into base64");
            int i = cewVar.a;
            StringBuilder sb = new StringBuilder(20);
            sb.append("Status: ");
            sb.append(i);
            sb.append("\n");
            arrayList.add(sb.toString());
            for (String str : cewVar.c.keySet()) {
                String str2 = (String) cewVar.c.get(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
                sb2.append("Header:");
                sb2.append(str);
                sb2.append(":");
                sb2.append(str2);
                sb2.append("\n");
                arrayList.add(sb2.toString());
            }
            int i2 = x.a;
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("GLS Status: ");
            sb3.append(i2);
            sb3.append("\n");
            arrayList.add(sb3.toString());
            Map map = x.c;
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 13 + String.valueOf(str4).length());
                sb4.append("GLS Header:");
                sb4.append(str3);
                sb4.append(":");
                sb4.append(str4);
                sb4.append("\n");
                arrayList.add(sb4.toString());
            }
            byte[] bArr = x.b;
            if (bArr != null) {
                String valueOf = String.valueOf(Base64.encodeToString(bArr, 2));
                arrayList.addAll(zgh.q(valueOf.length() != 0 ? "GLS response in base64: ".concat(valueOf) : new String("GLS response in base64: ")));
            } else {
                arrayList.add("GLS Response had no data.");
            }
        } catch (cey unused) {
            return super.w(cewVar);
        }
        return arrayList;
    }
}
