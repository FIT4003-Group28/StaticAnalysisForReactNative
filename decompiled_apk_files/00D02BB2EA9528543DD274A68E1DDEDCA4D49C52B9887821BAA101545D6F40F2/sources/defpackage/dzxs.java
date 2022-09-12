package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzxs  reason: default package */
/* loaded from: classes6.dex */
public final class dzxs extends dzvy implements dzvi<CharSequence, Integer, dzsx<? extends Integer, ? extends Integer>> {
    final /* synthetic */ List a;

    public dzxs(List list) {
        this.a = list;
    }

    @Override // defpackage.dzvi
    public final /* bridge */ /* synthetic */ dzsx<? extends Integer, ? extends Integer> a(CharSequence charSequence, Integer num) {
        Object obj;
        dzsx a;
        Object obj2;
        Object obj3;
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        dzvx.c(charSequence2, "$receiver");
        List list = this.a;
        if (list.size() == 1) {
            dzvx.c(list, "$this$single");
            if (list instanceof List) {
                dzvx.c(list, "$this$single");
                int size = list.size();
                if (size == 0) {
                    throw new NoSuchElementException("List is empty.");
                }
                if (size != 1) {
                    throw new IllegalArgumentException("List has more than one element.");
                }
                obj3 = list.get(0);
            } else {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                Object next = it.next();
                if (it.hasNext()) {
                    throw new IllegalArgumentException("Collection has more than one element.");
                }
                obj3 = next;
            }
            String str = (String) obj3;
            dzvx.c(charSequence2, "$this$indexOf");
            dzvx.c(str, "string");
            int i = -1;
            if (!(charSequence2 instanceof String)) {
                dzwi dzwiVar = new dzwi(dzwj.a(intValue, 0), dzwj.b(charSequence2.length(), charSequence2.length()));
                int i2 = dzwiVar.a;
                int i3 = dzwiVar.b;
                if (i2 <= i3) {
                    while (true) {
                        if (!dzxg.c(str, charSequence2, i2, str.length())) {
                            if (i2 == i3) {
                                break;
                            }
                            i2++;
                        } else {
                            i = i2;
                            break;
                        }
                    }
                }
            } else {
                i = ((String) charSequence2).indexOf(str, intValue);
            }
            if (i >= 0) {
                a = dzsz.a(Integer.valueOf(i), str);
            }
            a = null;
        } else {
            dzwi dzwiVar2 = new dzwi(dzwj.a(intValue, 0), charSequence2.length());
            if (charSequence2 instanceof String) {
                int i4 = dzwiVar2.a;
                int i5 = dzwiVar2.b;
                if (i4 <= i5) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            String str2 = (String) obj2;
                            String str3 = (String) charSequence2;
                            int length = str2.length();
                            dzvx.c(str2, "$this$regionMatches");
                            dzvx.c(str3, "other");
                            if (str2.regionMatches(0, str3, i4, length)) {
                                break;
                            }
                        }
                        String str4 = (String) obj2;
                        if (str4 == null) {
                            if (i4 == i5) {
                                break;
                            }
                            i4++;
                        } else {
                            a = dzsz.a(Integer.valueOf(i4), str4);
                            break;
                        }
                    }
                }
                a = null;
            } else {
                int i6 = dzwiVar2.a;
                int i7 = dzwiVar2.b;
                if (i6 <= i7) {
                    while (true) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            String str5 = (String) obj;
                            if (dzxg.c(str5, charSequence2, i6, str5.length())) {
                                break;
                            }
                        }
                        String str6 = (String) obj;
                        if (str6 == null) {
                            if (i6 == i7) {
                                break;
                            }
                            i6++;
                        } else {
                            a = dzsz.a(Integer.valueOf(i6), str6);
                            break;
                        }
                    }
                }
                a = null;
            }
        }
        if (a != null) {
            return dzsz.a(a.a, Integer.valueOf(((String) a.b).length()));
        }
        return null;
    }
}
