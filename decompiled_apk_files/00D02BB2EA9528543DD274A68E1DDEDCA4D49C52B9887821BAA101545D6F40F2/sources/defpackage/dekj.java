package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
/* compiled from: PG */
/* renamed from: dekj  reason: default package */
/* loaded from: classes6.dex */
public final class dekj {
    @dzsi
    private static Properties a;

    private dekj() {
    }

    public static Map<String, String> a() {
        LinkedHashMap linkedHashMap;
        Properties c = c();
        if (c.isEmpty()) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("Built on", c.getProperty("build.time", ""));
            linkedHashMap2.put("Build timestamp", c.getProperty("build.timestamp", ""));
            linkedHashMap2.put("Build timestamp as int", c.getProperty("build.timestamp.as.int", ""));
            linkedHashMap2.put("Built at", c.getProperty("build.location", ""));
            linkedHashMap2.put("Build target", c.getProperty("build.target", ""));
            linkedHashMap2.put("Build ID", c.getProperty("build.build_id", "<unknown>"));
            linkedHashMap2.put("Build changelist", c.getProperty("build.changelist", ""));
            linkedHashMap2.put("Build changelist as int", c.getProperty("build.changelist.as.int", ""));
            linkedHashMap2.put("Build version map", c.getProperty("build.versionmap", ""));
            linkedHashMap2.put("Build client", c.getProperty("build.client", ""));
            linkedHashMap2.put("Build client mint status", c.getProperty("build.client_mint_status", ""));
            linkedHashMap2.put("Build depot path", c.getProperty("build.depot.path", ""));
            linkedHashMap2.put("Build baseline changelist as int", c.getProperty("build.baseline.changelist.as.int", ""));
            linkedHashMap2.put("Build label", c.getProperty("build.label", ""));
            linkedHashMap2.put("Build tool", c.getProperty("build.tool", ""));
            linkedHashMap2.put("Build gplatform", c.getProperty("build.gplatform", ""));
            linkedHashMap2.put("Mpm version", c.getProperty("build.mpm.version", ""));
            linkedHashMap2.put("Citc snapshot", c.getProperty("build.citc.snapshot", Integer.toString(-1)));
            linkedHashMap2.put("Verifiable", c.getProperty("build.verifiable", "0"));
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap != null ? linkedHashMap : Collections.emptyMap();
    }

    public static int b() {
        try {
            try {
                return Integer.parseInt(a().get("Build baseline changelist as int"));
            } catch (NumberFormatException unused) {
                return Integer.parseInt(a().get("Build changelist"));
            }
        } catch (NumberFormatException unused2) {
            return -1;
        }
    }

    private static synchronized Properties c() {
        Properties properties;
        synchronized (dekj.class) {
            if (a == null) {
                a = new Properties();
                try {
                    InputStream resourceAsStream = dekj.class.getResourceAsStream("/build-data.properties");
                    if (resourceAsStream != null) {
                        try {
                            a.load(resourceAsStream);
                            resourceAsStream.close();
                        } catch (Throwable th) {
                            resourceAsStream.close();
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            properties = a;
        }
        return properties;
    }
}
