package defpackage;
/* compiled from: PG */
/* renamed from: dzur  reason: default package */
/* loaded from: classes6.dex */
public final class dzur {
    public static final <T> Class<T> a(dzwn<T> dzwnVar) {
        dzvx.c(dzwnVar, "$this$javaObjectType");
        Class<T> cls = (Class<T>) ((dzvs) dzwnVar).a();
        if (!cls.isPrimitive()) {
            if (cls == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
            }
            return cls;
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        cls = (Class<T>) Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        cls = (Class<T>) Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        cls = (Class<T>) Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        cls = (Class<T>) Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        cls = (Class<T>) Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        cls = (Class<T>) Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        cls = (Class<T>) Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        cls = (Class<T>) Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        cls = (Class<T>) Short.class;
                        break;
                    }
                    break;
            }
        }
        if (cls == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
        return cls;
    }
}
