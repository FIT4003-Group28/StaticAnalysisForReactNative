package defpackage;

import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
/* compiled from: PG */
/* renamed from: abct  reason: default package */
/* loaded from: classes.dex */
public final class abct extends aaqs {
    private SetSettingEndpointOuterClass$SetSettingEndpoint a;

    public abct(aaqf aaqfVar, afvm afvmVar) {
        super("account/set_setting", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = ascr.a.createBuilder();
        String str = this.a.e;
        createBuilder.copyOnWrite();
        ascr ascrVar = (ascr) createBuilder.instance;
        str.getClass();
        ascrVar.b |= 2;
        ascrVar.d = str;
        aopa createBuilder2 = asct.a.createBuilder();
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = this.a;
        int i = setSettingEndpointOuterClass$SetSettingEndpoint.c;
        if (i == 3) {
            boolean booleanValue = ((Boolean) setSettingEndpointOuterClass$SetSettingEndpoint.d).booleanValue();
            createBuilder2.copyOnWrite();
            asct asctVar = (asct) createBuilder2.instance;
            asctVar.b = 2 | asctVar.b;
            asctVar.d = booleanValue;
        } else if (i == 4) {
            long longValue = ((Long) setSettingEndpointOuterClass$SetSettingEndpoint.d).longValue();
            createBuilder2.copyOnWrite();
            asct asctVar2 = (asct) createBuilder2.instance;
            asctVar2.b |= 4;
            asctVar2.e = longValue;
        } else if (i == 2) {
            String str2 = (String) setSettingEndpointOuterClass$SetSettingEndpoint.d;
            createBuilder2.copyOnWrite();
            asct asctVar3 = (asct) createBuilder2.instance;
            str2.getClass();
            asctVar3.b |= 1;
            asctVar3.c = str2;
        }
        createBuilder.copyOnWrite();
        ascr ascrVar2 = (ascr) createBuilder.instance;
        asct asctVar4 = (asct) createBuilder2.mo39build();
        asctVar4.getClass();
        ascrVar2.e = asctVar4;
        ascrVar2.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.a.e);
    }

    public final void t(SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint) {
        setSettingEndpointOuterClass$SetSettingEndpoint.getClass();
        this.a = setSettingEndpointOuterClass$SetSettingEndpoint;
    }
}
