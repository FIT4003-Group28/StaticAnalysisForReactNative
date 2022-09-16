package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: affg  reason: default package */
/* loaded from: classes.dex */
public final class affg implements afip {
    private final List a;

    public affg(List list) {
        this.a = list;
    }

    @Override // defpackage.afip
    public final String a(long j) {
        StringBuilder sb = new StringBuilder();
        for (affh affhVar : this.a) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            if (affhVar.b() >= j) {
                double b = affhVar.b() - j;
                Double.isNaN(b);
                sb.append(b / 1000.0d);
            }
            sb.append("-");
            afte afteVar = afte.NATIVE_MEDIA_PLAYER;
            affi affiVar = affi.ATTACH_MEDIA_VIEW;
            switch (affhVar.c().ordinal()) {
                case 0:
                    sb.append("a");
                    break;
                case 1:
                    sb.append("b");
                    break;
                case 2:
                    sb.append("c");
                    break;
                case 3:
                    sb.append("d");
                    break;
                case 4:
                    sb.append("e");
                    sb.append(affhVar.d().ordinal());
                    sb.append("-");
                    if (affhVar.f() instanceof String) {
                        sb.append((String) affhVar.f());
                        break;
                    }
                    break;
                case 5:
                    sb.append("f");
                    break;
                case 6:
                    sb.append("g");
                    sb.append(affhVar.a());
                    break;
                case 7:
                    sb.append("h-");
                    if (affhVar.f() instanceof String) {
                        sb.append((String) affhVar.f());
                        break;
                    }
                    break;
                case 8:
                    sb.append("i");
                    break;
                case 9:
                    sb.append("j");
                    break;
                case 10:
                    sb.append("k");
                    break;
                case 11:
                    sb.append("l");
                    break;
                case 12:
                    sb.append("m");
                    break;
                case 13:
                    sb.append("n");
                    break;
                case 14:
                    sb.append("o");
                    break;
                case 15:
                    sb.append("p");
                    break;
                case 16:
                    sb.append("q");
                    break;
                case 17:
                    sb.append("r");
                    Object f = affhVar.f();
                    if (f instanceof phr) {
                        double d = ((phr) f).i - j;
                        Double.isNaN(d);
                        sb.append(d / 1000.0d);
                        break;
                    }
                    break;
                case 18:
                    sb.append("s");
                    sb.append(affhVar.a());
                    break;
                case 19:
                    sb.append("t");
                    sb.append(affhVar.a());
                    break;
                case 20:
                    sb.append("u");
                    if (affhVar.f() instanceof String) {
                        sb.append((String) affhVar.f());
                        break;
                    }
                    break;
            }
            int ordinal = affhVar.e().ordinal();
            if (ordinal == 0) {
                sb.append("A");
            } else if (ordinal == 1) {
                sb.append("B");
            } else if (ordinal == 2) {
                sb.append("C");
            } else {
                sb.append("D");
            }
        }
        sb.insert(0, "e;");
        return sb.toString();
    }
}
