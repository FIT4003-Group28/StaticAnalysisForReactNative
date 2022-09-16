package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.backup.Backup;
import j$.time.Duration;
/* compiled from: PG */
/* renamed from: ahfn  reason: default package */
/* loaded from: classes.dex */
public final class ahfn {
    @Backup
    public static final String AUTONAV = "autonav";
    @Backup
    public static final String NERD_STATS_ENABLED = "nerd_stats_enabled";
    @Backup
    public static final String SUBTITLES_ENABLED = "subtitles_enabled";
    @Backup
    public static final String SUBTITLES_LANGUAGE_CODE = "subtitles_language_code";

    private ahfn() {
    }

    public static final Class[] a(ahvq ahvqVar, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahvqVar.a((ahhv) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhv.class};
    }

    public static Uri b(Context context) {
        return yhr.a(context, "player", "features/backup.pb");
    }

    public static awvc c() {
        aopa createBuilder = awvc.a.createBuilder();
        Duration ofSeconds = Duration.ofSeconds(10L);
        ofSeconds.getClass();
        aooo c = aost.c(ofSeconds.getSeconds(), ofSeconds.getNano());
        createBuilder.copyOnWrite();
        awvc awvcVar = (awvc) createBuilder.instance;
        c.getClass();
        awvcVar.c = c;
        awvcVar.b |= 1;
        return (awvc) createBuilder.mo39build();
    }
}
