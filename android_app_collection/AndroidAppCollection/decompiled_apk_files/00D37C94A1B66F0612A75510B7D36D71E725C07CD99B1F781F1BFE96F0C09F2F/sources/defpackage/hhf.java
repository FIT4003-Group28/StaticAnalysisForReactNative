package defpackage;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: hhf  reason: default package */
/* loaded from: classes3.dex */
public final class hhf implements ampg {
    private final /* synthetic */ int a;

    public hhf() {
    }

    public hhf(int i) {
        this.a = i;
    }

    @Override // defpackage.ampg
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        if (i == 0) {
            aotm aotmVar = (aotm) obj;
            aopa createBuilder = aqsm.a.createBuilder();
            if ((aotmVar.b & 1) != 0) {
                int i2 = aotmVar.c;
                createBuilder.copyOnWrite();
                aqsm aqsmVar = (aqsm) createBuilder.instance;
                aqsmVar.b |= 1;
                aqsmVar.c = i2;
            }
            if ((aotmVar.b & 2) != 0) {
                int i3 = aotmVar.d;
                createBuilder.copyOnWrite();
                aqsm aqsmVar2 = (aqsm) createBuilder.instance;
                aqsmVar2.b |= 2;
                aqsmVar2.d = i3;
            }
            aopp aoppVar = aotmVar.e;
            createBuilder.copyOnWrite();
            aqsm aqsmVar3 = (aqsm) createBuilder.instance;
            aopp aoppVar2 = aqsmVar3.e;
            if (!aoppVar2.c()) {
                aqsmVar3.e = aopi.mutableCopy(aoppVar2);
            }
            aonk.addAll((Iterable) aoppVar, (List) aqsmVar3.e);
            if ((aotmVar.b & 4) != 0) {
                int f = apfu.f(aotmVar.f);
                if (f == 0 || f != 2) {
                    createBuilder.copyOnWrite();
                    aqsm aqsmVar4 = (aqsm) createBuilder.instance;
                    aqsmVar4.f = 0;
                    aqsmVar4.b = 4 | aqsmVar4.b;
                } else {
                    createBuilder.copyOnWrite();
                    aqsm aqsmVar5 = (aqsm) createBuilder.instance;
                    aqsmVar5.f = 1;
                    aqsmVar5.b = 4 | aqsmVar5.b;
                }
            }
            return (aqsm) createBuilder.mo39build();
        } else if (i == 1) {
            return ((cgz) obj).a;
        } else {
            if (i == 2) {
                awzo awzoVar = (awzo) obj;
                awzo awzoVar2 = awzo.ALIGN_HORIZONTAL_UNSPECIFIED;
                int ordinal = awzoVar.ordinal();
                if (ordinal == 0) {
                    return awbc.ALIGN_HORIZONTAL_UNSPECIFIED;
                }
                if (ordinal == 1) {
                    return awbc.ALIGN_HORIZONTAL_ALIGN_LEFT;
                }
                if (ordinal == 2) {
                    return awbc.ALIGN_HORIZONTAL_ALIGN_CENTER;
                }
                if (ordinal != 3) {
                    String valueOf = String.valueOf(awzoVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append("unknown enum value: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                return awbc.ALIGN_HORIZONTAL_ALIGN_RIGHT;
            } else if (i == 3) {
                axak axakVar = (axak) obj;
                axak axakVar2 = axak.FONT_FAMILY_UNSPECIFIED;
                switch (axakVar.ordinal()) {
                    case 0:
                        return awbd.FONT_FAMILY_UNSPECIFIED;
                    case 1:
                        return awbd.FONT_FAMILY_CLASSIC;
                    case 2:
                        return awbd.FONT_FAMILY_LIGHT;
                    case 3:
                        return awbd.FONT_FAMILY_HEAVY;
                    case 4:
                        return awbd.FONT_FAMILY_MARKER;
                    case 5:
                        return awbd.FONT_FAMILY_BRUSH;
                    case 6:
                        return awbd.FONT_FAMILY_TYPEWRITER;
                    default:
                        String valueOf2 = String.valueOf(axakVar);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                        sb2.append("unknown enum value: ");
                        sb2.append(valueOf2);
                        throw new IllegalArgumentException(sb2.toString());
                }
            } else if (i != 4) {
                if (i == 5) {
                    ages agesVar = (ages) obj;
                    ages agesVar2 = ages.USER_CHANGED;
                    int ordinal2 = agesVar.ordinal();
                    if (ordinal2 == 0) {
                        return agey.USER_CHANGED;
                    }
                    if (ordinal2 == 1) {
                        return agey.LOCALE_CHANGED;
                    }
                    if (ordinal2 != 2) {
                        String valueOf3 = String.valueOf(agesVar);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 20);
                        sb3.append("unknown enum value: ");
                        sb3.append(valueOf3);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    return agey.FCM_TOKEN_CHANGED;
                }
                return Boolean.valueOf(Arrays.asList(((Constructor) obj).getParameterTypes()).contains(String.class));
            } else {
                ihy ihyVar = (ihy) obj;
                aopa createBuilder2 = axbz.a.createBuilder();
                String str = ihyVar.a;
                createBuilder2.copyOnWrite();
                axbz axbzVar = (axbz) createBuilder2.instance;
                str.getClass();
                axbzVar.b = 1 | axbzVar.b;
                axbzVar.c = str;
                String str2 = ihyVar.b;
                createBuilder2.copyOnWrite();
                axbz axbzVar2 = (axbz) createBuilder2.instance;
                str2.getClass();
                axbzVar2.b = 2 | axbzVar2.b;
                axbzVar2.d = str2;
                int spanStart = ihyVar.d.b.getText().getSpanStart(ihyVar.c);
                createBuilder2.copyOnWrite();
                axbz axbzVar3 = (axbz) createBuilder2.instance;
                axbzVar3.b = 4 | axbzVar3.b;
                axbzVar3.e = spanStart;
                int spanEnd = ihyVar.d.b.getText().getSpanEnd(ihyVar.c);
                createBuilder2.copyOnWrite();
                axbz axbzVar4 = (axbz) createBuilder2.instance;
                axbzVar4.b |= 8;
                axbzVar4.f = spanEnd;
                return (axbz) createBuilder2.mo39build();
            }
        }
    }
}
