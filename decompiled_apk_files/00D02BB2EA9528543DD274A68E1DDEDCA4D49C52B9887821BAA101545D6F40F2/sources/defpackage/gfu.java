package defpackage;
/* compiled from: PG */
/* renamed from: gfu  reason: default package */
/* loaded from: classes.dex */
public enum gfu {
    ACTIVITY_FRAGMENT("activity-fragment"),
    DIALOG_FRAGMENT("dialog-fragment");
    
    public final String c;

    gfu(String str) {
        this.c = str;
    }

    public static String b(Class<? extends fd> cls, gfu gfuVar, gfs... gfsVarArr) {
        StringBuilder sb = new StringBuilder(cls.getName());
        sb.append(",");
        if (gfsVarArr != null) {
            for (gfs gfsVar : gfsVarArr) {
                sb.append(gfsVar.a());
                sb.append(",");
            }
        }
        sb.append(gfuVar.c);
        return sb.toString();
    }

    public static String c(ggg gggVar) {
        return b(gggVar.getClass(), gggVar.Nx(), (gfs[]) gggVar.aO().toArray(new gfs[0]));
    }

    public final boolean a(@dzsi String str) {
        String valueOf = String.valueOf(this.c);
        return str.endsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","));
    }
}
