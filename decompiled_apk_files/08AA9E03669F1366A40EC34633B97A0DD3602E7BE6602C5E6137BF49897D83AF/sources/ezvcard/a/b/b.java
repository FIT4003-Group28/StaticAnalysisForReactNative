package ezvcard.a.b;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.a.b;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Agent;
import ezvcard.property.VCardProperty;
/* compiled from: AgentScribe.java */
/* loaded from: classes.dex */
public class b extends bg<Agent> {
    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return null;
    }

    public b() {
        super(Agent.class, "AGENT");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Agent b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        Agent agent = new Agent();
        if (vCardDataType == null) {
            throw new ezvcard.a.b(new a(agent));
        }
        agent.setUrl(com.b.a.a.b.e.a(str));
        return agent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AgentScribe.java */
    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final Agent f5481a;

        public a(Agent agent) {
            this.f5481a = agent;
        }

        @Override // ezvcard.a.b.a
        public void a(VCard vCard) {
            this.f5481a.setVCard(vCard);
        }

        @Override // ezvcard.a.b.a
        public VCardProperty a() {
            return this.f5481a;
        }
    }
}
