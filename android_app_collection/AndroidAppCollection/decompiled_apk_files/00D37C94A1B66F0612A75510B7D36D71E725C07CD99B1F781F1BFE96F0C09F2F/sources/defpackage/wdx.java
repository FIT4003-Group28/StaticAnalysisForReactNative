package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import j$.util.Optional;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wdx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wdx implements ampg {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ wdx(String str) {
        this.a = str;
    }

    public /* synthetic */ wdx(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        aopa mo52toBuilder;
        int i = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((awtd) obj).d.containsKey(this.a));
            case 1:
                return Optional.ofNullable((aorw) Collections.unmodifiableMap(((awtd) obj).h).get(this.a));
            case 2:
                String str = this.a;
                Map unmodifiableMap = Collections.unmodifiableMap(((awtd) obj).g);
                if (!unmodifiableMap.containsKey(str)) {
                    return null;
                }
                return (Long) unmodifiableMap.get(str);
            case 3:
                String str2 = this.a;
                aopa mo52toBuilder2 = ((awtd) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                ((awtd) mo52toBuilder2.instance).a().remove(str2);
                return (awtd) mo52toBuilder2.mo39build();
            case 4:
                String str3 = this.a;
                aopa mo52toBuilder3 = ((awtd) obj).mo52toBuilder();
                mo52toBuilder3.aZ(str3);
                return (awtd) mo52toBuilder3.mo39build();
            case 5:
                String str4 = this.a;
                aopa mo52toBuilder4 = ((awtd) obj).mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                awtd awtdVar = (awtd) mo52toBuilder4.instance;
                awtdVar.b |= 4;
                awtdVar.f = str4;
                return (awtd) mo52toBuilder4.mo39build();
            case 6:
                String str5 = this.a;
                aopa mo52toBuilder5 = ((awtd) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                awtd awtdVar2 = (awtd) mo52toBuilder5.instance;
                awtdVar2.b |= 1;
                awtdVar2.c = str5;
                return (awtd) mo52toBuilder5.mo39build();
            case 7:
                String str6 = this.a;
                for (ambn ambnVar : (List) obj) {
                    if (str6.equals(ambnVar.b.c)) {
                        return ambnVar.a;
                    }
                }
                throw new IllegalStateException(str6.length() != 0 ? "UserId didn't map to Account: ".concat(str6) : new String("UserId didn't map to Account: "));
            case 8:
                String str7 = this.a;
                aopa mo52toBuilder6 = ((aoud) obj).mo52toBuilder();
                mo52toBuilder6.copyOnWrite();
                aoud aoudVar = (aoud) mo52toBuilder6.instance;
                str7.getClass();
                aoudVar.b |= 1;
                aoudVar.c = str7;
                return (aoud) mo52toBuilder6.mo39build();
            case 9:
                String str8 = this.a;
                aopa mo52toBuilder7 = ((awti) obj).mo52toBuilder();
                mo52toBuilder7.bb(znx.e(str8), 1);
                return (awti) mo52toBuilder7.mo39build();
            case 10:
                String str9 = this.a;
                aopa mo52toBuilder8 = ((awti) obj).mo52toBuilder();
                mo52toBuilder8.bb(znx.e(str9), 2);
                return (awti) mo52toBuilder8.mo39build();
            case 11:
                String str10 = this.a;
                awti awtiVar = (awti) obj;
                if (awtiVar != null) {
                    str10.getClass();
                    aoqp aoqpVar = awtiVar.d;
                    if (aoqpVar.containsKey(str10)) {
                        i = ((Integer) aoqpVar.get(str10)).intValue();
                    }
                }
                return Integer.valueOf(i);
            case 12:
                String str11 = this.a;
                aotz aotzVar = (aotz) obj;
                if (TextUtils.isEmpty(str11)) {
                    return aotz.a;
                }
                aopa mo52toBuilder9 = aotzVar.mo52toBuilder();
                mo52toBuilder9.copyOnWrite();
                aotz aotzVar2 = (aotz) mo52toBuilder9.instance;
                str11.getClass();
                aotzVar2.b |= 1;
                aotzVar2.c = str11;
                return (aotz) mo52toBuilder9.mo39build();
            case 13:
                String str12 = this.a;
                awtv awtvVar = (awtv) obj;
                int i2 = adci.d;
                String.format("createPromptRecord= id=%s ignoredCount=%s", awtvVar.c, Integer.valueOf(awtvVar.d));
                if (awtvVar.c.equals(str12)) {
                    return awtvVar;
                }
                aopa createBuilder = awtv.a.createBuilder();
                createBuilder.copyOnWrite();
                awtv awtvVar2 = (awtv) createBuilder.instance;
                str12.getClass();
                awtvVar2.b = 1 | awtvVar2.b;
                awtvVar2.c = str12;
                createBuilder.copyOnWrite();
                awtv awtvVar3 = (awtv) createBuilder.instance;
                awtvVar3.b = 2 | awtvVar3.b;
                awtvVar3.d = 0;
                return (awtv) createBuilder.mo39build();
            case 14:
                String str13 = this.a;
                awtx awtxVar = (awtx) obj;
                if (awtxVar != null) {
                    mo52toBuilder = awtxVar.mo52toBuilder();
                } else {
                    mo52toBuilder = awtx.a.createBuilder();
                }
                mo52toBuilder.copyOnWrite();
                awtx awtxVar2 = (awtx) mo52toBuilder.instance;
                str13.getClass();
                awtxVar2.b |= 1;
                awtxVar2.c = str13;
                return (awtx) mo52toBuilder.mo39build();
            case 15:
                String str14 = this.a;
                int i3 = TvSignInControllerImpl.o;
                aopa mo52toBuilder10 = ((awua) obj).mo52toBuilder();
                mo52toBuilder10.copyOnWrite();
                awua awuaVar = (awua) mo52toBuilder10.instance;
                str14.getClass();
                aopu aopuVar = awuaVar.d;
                if (!aopuVar.c()) {
                    awuaVar.d = aopi.mutableCopy(aopuVar);
                }
                awuaVar.d.add(str14);
                return (awua) mo52toBuilder10.mo39build();
            case 16:
                String str15 = this.a;
                aopa mo52toBuilder11 = ((awuj) obj).mo52toBuilder();
                mo52toBuilder11.copyOnWrite();
                ((awuj) mo52toBuilder11.instance).a().clear();
                mo52toBuilder11.copyOnWrite();
                awuj awujVar = (awuj) mo52toBuilder11.instance;
                str15.getClass();
                awujVar.b |= 128;
                awujVar.p = str15;
                return (awuj) mo52toBuilder11.mo39build();
            case 17:
                String str16 = this.a;
                aopa mo52toBuilder12 = ((awus) obj).mo52toBuilder();
                str16.getClass();
                mo52toBuilder12.copyOnWrite();
                ((awus) mo52toBuilder12.instance).c().remove(str16);
                str16.getClass();
                mo52toBuilder12.copyOnWrite();
                ((awus) mo52toBuilder12.instance).f().remove(str16);
                str16.getClass();
                mo52toBuilder12.copyOnWrite();
                ((awus) mo52toBuilder12.instance).d().remove(str16);
                str16.getClass();
                mo52toBuilder12.copyOnWrite();
                ((awus) mo52toBuilder12.instance).g().remove(str16);
                str16.getClass();
                mo52toBuilder12.copyOnWrite();
                ((awus) mo52toBuilder12.instance).a().remove(str16);
                str16.getClass();
                mo52toBuilder12.copyOnWrite();
                ((awus) mo52toBuilder12.instance).e().remove(str16);
                str16.getClass();
                mo52toBuilder12.copyOnWrite();
                ((awus) mo52toBuilder12.instance).b().remove(str16);
                return (awus) mo52toBuilder12.mo39build();
            case 18:
                String str17 = this.a;
                aopa mo52toBuilder13 = ((awux) obj).mo52toBuilder();
                mo52toBuilder13.copyOnWrite();
                awux awuxVar = (awux) mo52toBuilder13.instance;
                str17.getClass();
                awuxVar.b |= 4;
                awuxVar.e = str17;
                return (awux) mo52toBuilder13.mo39build();
            case 19:
                return this.a;
            default:
                String str18 = this.a;
                aoob aoobVar = (aoob) Collections.unmodifiableMap(((baqg) obj).b).get(str18);
                if (aoobVar == null) {
                    throw new IllegalArgumentException(String.format("%s payload id is not found", str18));
                }
                return aoobVar;
        }
    }
}
