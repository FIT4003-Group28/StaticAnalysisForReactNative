package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxi  reason: default package */
/* loaded from: classes2.dex */
public final class azxi extends azri implements azxf, azrj {
    public final azxf a;
    public final azrd b;
    public final int c;
    private azrd d;
    private azqy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azxi(azxf azxfVar, azrd azrdVar) {
        super(azxh.a, azre.a);
        azxfVar.getClass();
        this.a = azxfVar;
        this.b = azrdVar;
        this.c = ((Number) azrdVar.fold(0, azrc.c)).intValue();
    }

    @Override // defpackage.azxf
    public final Object emit(Object obj, azqy azqyVar) {
        Comparable comparable;
        try {
            azrd context = azqyVar.getContext();
            context.getClass();
            azvo azvoVar = (azvo) context.get(azvo.b);
            if (azvoVar != null && !azvoVar.l()) {
                throw azvoVar.h();
            }
            azrd azrdVar = this.d;
            if (azrdVar != context) {
                int i = 0;
                if (azrdVar instanceof azxg) {
                    String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((azxg) azrdVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                    str.getClass();
                    List c = aztk.c(new aztj(new aztm(str, new azto(azqn.f(new String[]{"\r\n", "\n", "\r"}))), new aztp(str)));
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj2 : c) {
                        if (!ayme.h((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(azqn.d(arrayList));
                    for (String str2 : arrayList) {
                        int length = str2.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                i2 = -1;
                                break;
                            } else if (!aztk.a(str2.charAt(i2))) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i2 == -1) {
                            i2 = str2.length();
                        }
                        arrayList2.add(Integer.valueOf(i2));
                    }
                    Iterator it = arrayList2.iterator();
                    if (!it.hasNext()) {
                        comparable = null;
                    } else {
                        comparable = (Comparable) it.next();
                        while (it.hasNext()) {
                            Comparable comparable2 = (Comparable) it.next();
                            if (comparable.compareTo(comparable2) > 0) {
                                comparable = comparable2;
                            }
                        }
                    }
                    Integer num = (Integer) comparable;
                    int intValue = num != null ? num.intValue() : 0;
                    int length2 = str.length();
                    c.size();
                    azsc aztnVar = "".length() == 0 ? azuq.b : new aztn();
                    int size = c.size() - 1;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : c) {
                        int i3 = i + 1;
                        if (i < 0) {
                            azqn.b();
                        }
                        String str3 = (String) obj3;
                        if ((i == 0 || i == size) && ayme.h(str3)) {
                            str3 = null;
                        } else {
                            str3.getClass();
                            if (intValue < 0) {
                                throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                            }
                            String substring = str3.substring(azst.g(intValue, str3.length()));
                            substring.getClass();
                            String str4 = (String) aztnVar.a(substring);
                            if (str4 != null) {
                                str3 = str4;
                            }
                        }
                        if (str3 != null) {
                            arrayList3.add(str3);
                        }
                        i = i3;
                    }
                    StringBuilder sb = new StringBuilder(length2);
                    azqn.e(arrayList3, sb, "\n", "", "");
                    String sb2 = sb.toString();
                    sb2.getClass();
                    throw new IllegalStateException(sb2.toString());
                }
                context.getClass();
                if (((Number) context.fold(0, new azxj(this))).intValue() != this.c) {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
                this.d = context;
            }
            this.e = azqyVar;
            Object emit = this.a.emit(obj, this);
            azrf azrfVar = azrf.COROUTINE_SUSPENDED;
            return emit == azrf.COROUTINE_SUSPENDED ? emit : azqm.a;
        } catch (Throwable th) {
            this.d = new azxg(th);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [azqy, azrj] */
    @Override // defpackage.azrg, defpackage.azrj
    public final azrj getCallerFrame() {
        ?? r0 = this.e;
        if (r0 instanceof azrj) {
            return r0;
        }
        return null;
    }

    @Override // defpackage.azri, defpackage.azqy
    public final azrd getContext() {
        azqy azqyVar = this.e;
        azrd context = azqyVar == null ? null : azqyVar.getContext();
        return context == null ? azre.a : context;
    }

    @Override // defpackage.azrg, defpackage.azrj
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.azrg
    public final Object invokeSuspend(Object obj) {
        Throwable a = azqh.a(obj);
        if (a != null) {
            this.d = new azxg(a);
        }
        azqy azqyVar = this.e;
        if (azqyVar != null) {
            azqyVar.resumeWith(obj);
        }
        return azrf.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.azri, defpackage.azrg
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
