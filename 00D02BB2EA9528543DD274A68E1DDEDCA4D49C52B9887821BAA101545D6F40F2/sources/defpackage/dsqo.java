package defpackage;
/* compiled from: PG */
/* renamed from: dsqo  reason: default package */
/* loaded from: classes.dex */
final class dsqo implements dssh {
    public static final dsqo a = new dsqo();

    private dsqo() {
    }

    @Override // defpackage.dssh
    public final boolean a(Class<?> cls) {
        return dsqw.class.isAssignableFrom(cls);
    }

    @Override // defpackage.dssh
    public final dssg b(Class<?> cls) {
        if (!dsqw.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(dsqw.class);
            dsqw<?, ?> dsqwVar = dsqw.bF.get(asSubclass);
            if (dsqwVar == null) {
                try {
                    Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                    dsqwVar = dsqw.bF.get(asSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (dsqwVar == null) {
                dsqwVar = (dsqw) ((dsqw) dsui.a(asSubclass)).cu(6);
                if (dsqwVar == null) {
                    throw new IllegalStateException();
                }
                dsqw.bF.put(asSubclass, dsqwVar);
            }
            return (dssg) dsqwVar.cu(3);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e2);
        }
    }
}
