package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: pts  reason: default package */
/* loaded from: classes4.dex */
final class pts {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b = Pattern.compile(pxi.z("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern c = Pattern.compile(pxi.z("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern d = Pattern.compile("\\\\an(\\d+)");
}
