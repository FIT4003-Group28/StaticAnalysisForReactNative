package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dasu  reason: default package */
/* loaded from: classes5.dex */
public final class dasu extends dasm {
    public final HttpURLConnection a;
    private final int b;
    private final String c;
    private final ArrayList<String> d;
    private final ArrayList<String> e;

    public dasu(HttpURLConnection httpURLConnection) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.d = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.e = arrayList2;
        this.a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.b = responseCode == -1 ? 0 : responseCode;
        this.c = httpURLConnection.getResponseMessage();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                for (String str : entry.getValue()) {
                    if (str != null) {
                        arrayList.add(key);
                        arrayList2.add(str);
                    }
                }
            }
        }
    }

    @Override // defpackage.dasm
    public final InputStream a() {
        InputStream errorStream;
        try {
            errorStream = this.a.getInputStream();
        } catch (IOException unused) {
            errorStream = this.a.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new dast(this, errorStream);
    }

    @Override // defpackage.dasm
    public final String b() {
        return this.a.getContentEncoding();
    }

    @Override // defpackage.dasm
    public final String c() {
        return this.a.getHeaderField("Content-Type");
    }

    @Override // defpackage.dasm
    public final String d() {
        String headerField = this.a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    @Override // defpackage.dasm
    public final int e() {
        return this.b;
    }

    @Override // defpackage.dasm
    public final String f() {
        return this.c;
    }

    @Override // defpackage.dasm
    public final int g() {
        return this.d.size();
    }

    @Override // defpackage.dasm
    public final String h(int i) {
        return this.d.get(i);
    }

    @Override // defpackage.dasm
    public final String i(int i) {
        return this.e.get(i);
    }

    @Override // defpackage.dasm
    public final void j() {
        this.a.disconnect();
    }
}
