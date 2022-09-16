package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hra  reason: default package */
/* loaded from: classes3.dex */
public final class hra {
    public final Context a;
    public final Executor b;
    private final Object d = new Object();
    public amuk c = amuk.q();
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public hra(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public static final int c() {
        return anp.b().a();
    }

    public final amuk a(String str) {
        String str2 = (String) this.f.get(str);
        if (this.e.get(str2) == null) {
            return amuk.q();
        }
        return amuk.o((Collection) this.e.get(str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (c() == 1) {
            try {
                ArrayList<String> arrayList = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.getResources().openRawResource(R.raw.emoji_list_with_variations), amoz.c));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    List h = amqf.c(",").h(str);
                    int i = 0;
                    anq anqVar = null;
                    hqz hqzVar = new hqz((String) h.get(0), (String) h.get(1), (h.size() != 3 || ((String) h.get(2)).isEmpty()) ? null : (String) h.get(2));
                    if (hqzVar.a()) {
                        this.f.put(hqzVar.a, hqzVar.c);
                        if (this.e.get(hqzVar.c) == null) {
                            this.e.put(hqzVar.c, new ArrayList());
                        }
                        ((List) this.e.get(hqzVar.c)).add(hqzVar.a);
                    }
                    if (!hqzVar.a() || hqzVar.b.equals(hqzVar.c)) {
                        String str2 = hqzVar.a;
                        anp b = anp.b();
                        hz.d(b.e(), "Not initialized yet");
                        ant antVar = ((ani) b.e).a;
                        ans ansVar = new ans(antVar.a.b, antVar.b, antVar.c);
                        int length = str2.length();
                        while (true) {
                            if (i < length) {
                                int codePointAt = Character.codePointAt(str2, i);
                                if (ansVar.a(codePointAt) != 2) {
                                    break;
                                }
                                i += Character.charCount(codePointAt);
                            } else if (ansVar.d()) {
                                anqVar = ansVar.b();
                            }
                        }
                        if (anqVar != null) {
                            arrayList2.add(hqzVar.a);
                        }
                    }
                }
                synchronized (this.d) {
                    this.c = amuk.o(arrayList2);
                }
                return;
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                afus.b(2, 9, valueOf.length() != 0 ? "VideoFX: Reading emoji from device failed ".concat(valueOf) : new String("VideoFX: Reading emoji from device failed "));
                return;
            }
        }
        afus.b(2, 9, "VideoFX: Reading emoji from device failed");
    }
}
