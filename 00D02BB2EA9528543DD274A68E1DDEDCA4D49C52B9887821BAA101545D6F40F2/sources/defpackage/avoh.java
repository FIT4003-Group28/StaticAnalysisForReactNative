package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: avoh  reason: default package */
/* loaded from: classes.dex */
public final class avoh extends Exception {
    public static final Pattern a = Pattern.compile("\\{(\\d+)\\}");
    private static final String b = "avoh";

    public avoh(String str, dluy dluyVar, @dzsi Exception exc) {
        super(String.format("%s(%s): %s", b, dluyVar.name(), str), exc);
    }

    public static avoh a(anam anamVar, dluy dluyVar) {
        avog avogVar = new avog();
        avogVar.d = dbsj.e(anamVar.getMessage());
        avogVar.a = dluyVar;
        avogVar.b = anamVar.b;
        avogVar.c = anamVar;
        return avogVar.a();
    }

    public static avoh b(anam anamVar, dluy dluyVar) {
        avog avogVar = new avog();
        String e = dbsj.e(anamVar.getMessage());
        StringBuilder sb = new StringBuilder(e.length() + 22);
        sb.append("Delete region failed:");
        sb.append(" ");
        sb.append(e);
        avogVar.d = sb.toString();
        avogVar.a = dluyVar;
        avogVar.b = anamVar.b;
        avogVar.c = anamVar;
        return avogVar.a();
    }
}
