package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Properties;
/* compiled from: PG */
/* renamed from: csvu  reason: default package */
/* loaded from: classes5.dex */
public final class csvu {
    private static csvu c;
    public int a;
    public int b;

    private csvu(Context context) {
        cstq.a();
        try {
            Properties properties = new Properties();
            properties.load(context.getAssets().open("lighter-properties.txt"));
            this.a = 2;
            String property = properties.getProperty("BUILD_BASELINE_CHANGELIST");
            this.b = TextUtils.isEmpty(property) ? 0 : Integer.parseInt(property);
        } catch (IOException e) {
            throw new RuntimeException("Lighter properties was not found in the apk", e);
        }
    }

    public static synchronized csvu a(Context context) {
        csvu csvuVar;
        synchronized (csvu.class) {
            csvuVar = c;
            if (csvuVar == null) {
                csvuVar = new csvu(context);
                c = csvuVar;
            }
        }
        return csvuVar;
    }
}
