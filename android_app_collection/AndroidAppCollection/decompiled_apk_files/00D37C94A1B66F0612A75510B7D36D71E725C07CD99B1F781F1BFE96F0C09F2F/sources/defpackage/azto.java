package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: azto  reason: default package */
/* loaded from: classes2.dex */
public final class azto extends azsu implements azsg {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azto(List list) {
        super(2);
        this.a = list;
    }

    @Override // defpackage.azsg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        azqf o;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        charSequence.getClass();
        List list = this.a;
        if (list.size() == 1) {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size == 1) {
                String str = (String) list.get(0);
                str.getClass();
                int i = -1;
                if (!(charSequence instanceof String)) {
                    aztd aztdVar = new aztd(azst.f(intValue, 0), azst.g(charSequence.length(), charSequence.length()));
                    int i2 = aztdVar.a;
                    int i3 = aztdVar.b;
                    if (i2 <= i3) {
                        while (true) {
                            if (!ayme.j(str, charSequence, i2, str.length())) {
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
                    i = ((String) charSequence).indexOf(str, intValue);
                }
                if (i >= 0) {
                    o = azqj.o(Integer.valueOf(i), str);
                }
                o = null;
            } else {
                throw new IllegalArgumentException("List has more than one element.");
            }
        } else {
            aztd aztdVar2 = new aztd(azst.f(intValue, 0), charSequence.length());
            if (charSequence instanceof String) {
                int i4 = aztdVar2.a;
                int i5 = aztdVar2.b;
                if (i4 <= i5) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str2 = (String) obj4;
                            int length = str2.length();
                            str2.getClass();
                            if (str2.regionMatches(0, (String) charSequence, i4, length)) {
                                break;
                            }
                        }
                        String str3 = (String) obj4;
                        if (str3 == null) {
                            if (i4 == i5) {
                                break;
                            }
                            i4++;
                        } else {
                            o = azqj.o(Integer.valueOf(i4), str3);
                            break;
                        }
                    }
                }
                o = null;
            } else {
                int i6 = aztdVar2.a;
                int i7 = aztdVar2.b;
                if (i6 <= i7) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str4 = (String) obj3;
                            if (ayme.j(str4, charSequence, i6, str4.length())) {
                                break;
                            }
                        }
                        String str5 = (String) obj3;
                        if (str5 == null) {
                            if (i6 == i7) {
                                break;
                            }
                            i6++;
                        } else {
                            o = azqj.o(Integer.valueOf(i6), str5);
                            break;
                        }
                    }
                }
                o = null;
            }
        }
        if (o != null) {
            return azqj.o(o.a, Integer.valueOf(((String) o.b).length()));
        }
        return null;
    }
}
