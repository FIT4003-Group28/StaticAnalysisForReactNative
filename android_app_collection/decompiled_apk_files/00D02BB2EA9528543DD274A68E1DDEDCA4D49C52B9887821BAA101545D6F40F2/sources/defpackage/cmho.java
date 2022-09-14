package defpackage;

import android.graphics.PointF;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmho  reason: default package */
/* loaded from: classes5.dex */
final class cmho {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b = Pattern.compile(cmny.z("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern c = Pattern.compile(cmny.z("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern d = Pattern.compile("\\\\an(\\d+)");
    public final int e;
    public final PointF f;

    public cmho(int i, PointF pointF) {
        this.e = i;
        this.f = pointF;
    }
}
