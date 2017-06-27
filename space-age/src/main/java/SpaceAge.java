class SpaceAge {
    
    double earth = 31557600;
    double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / earth;
    }

    double onMercury() {
        return seconds / (earth * 0.2408467);
    }

    double onVenus() {
        return seconds / (earth * 0.61519726);
    }

    double onMars() {
        return seconds / (earth * 1.8808158);
    }

    double onJupiter() {
        return seconds / (earth * 11.862615);
    }

    double onSaturn() {
        return seconds / (earth * 29.447498);
    }

    double onUranus() {
        return seconds / (earth * 84.016846);
    }

    double onNeptune() {
        return seconds / (earth * 164.79132);
    }

}
