package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: czoi  reason: default package */
/* loaded from: classes5.dex */
public final class czoi {
    public final String a;
    public final String b;
    public final dubf c;
    public duch d;
    public String e;
    public long f;
    public dcdc<String> g;

    public czoi(String str, String str2, dubf dubfVar) {
        if (!TextUtils.isEmpty(str)) {
            if (dubfVar != null) {
                this.a = str;
                this.b = str2;
                this.c = dubfVar;
                return;
            }
            throw new IllegalArgumentException("Payload is null.");
        }
        throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
    }
}
